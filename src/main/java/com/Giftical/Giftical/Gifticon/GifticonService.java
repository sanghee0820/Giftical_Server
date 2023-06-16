package com.Giftical.Giftical.Gifticon;

import com.Giftical.Giftical.Product.Product;
import com.Giftical.Giftical.Product.ProductRepository;
import com.Giftical.Giftical.Store.StoreRepository;
import com.Giftical.Giftical.User.UserRepository;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.asm.Advice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class GifticonService {
    private final GifticonRepository gifticonRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public String buyProduct(GifticonmakeDTO gifticonmakeDTO){
        Optional<Product> product = productRepository.findById(gifticonmakeDTO.getProductId());

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int barcode_int = random.nextInt(2147483647-1000000000) + 1000000000;
        String barcode = Integer.toString(barcode_int);

        Gifticon gifticon = new Gifticon();
        gifticon.setUserId(gifticonmakeDTO.getUserId());
        gifticon.setProductId(gifticonmakeDTO.getProductId());
        gifticon.setStoreId(gifticonmakeDTO.getStoreId());
        gifticon.setBarcode(barcode);
//        gifticon.setGiftCost(product.get().getProductPrice());
        gifticon.setGiftCost(3000);
        gifticon.setGiftUsedValue(false);
        gifticon.setGiftUsedDate(null);

        gifticon.setGiftGenerateDate(Date.valueOf(LocalDate.now()));
        gifticon.setGiftEndDate(Date.valueOf(LocalDate.now().plusMonths(6)));

        Gifticon newGifticon = gifticonRepository.save(gifticon);

        return newGifticon.getBarcode();
    }
    @Transactional
    public ResponseEntity<Boolean> checkBarcode(String barcode){
        Gifticon gifticon = gifticonRepository.findByBarcode(barcode);
        if(gifticon.getGiftUsedValue() == false ) {
            gifticon.setGiftUsedValue(true);
            gifticon.setGiftUsedDate(Date.valueOf(LocalDate.now()));
            return new ResponseEntity<>(true, HttpStatus.valueOf(200));
        }
        return new ResponseEntity<>(false, HttpStatus.valueOf(200));
    }
}
