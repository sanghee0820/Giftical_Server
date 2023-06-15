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
import org.springframework.stereotype.Service;

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
        gifticon.setGiftCost(1);
        gifticon.setGiftUsedValue(false);
        gifticon.setGiftUsedDate(null);

        gifticon.setGiftGenerateDate(Date.valueOf(LocalDate.now()));
        gifticon.setGiftEndDate(Date.valueOf(LocalDate.now().plusMonths(6)));

        Gifticon newGifticon = gifticonRepository.save(gifticon);

        return newGifticon.getBarcode();
    }
}
