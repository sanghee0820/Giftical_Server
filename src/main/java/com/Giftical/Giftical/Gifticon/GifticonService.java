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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GifticonService {
    private final GifticonRepository gifticonRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public String generateGifticon(Long productId){
        Optional<Product> product = productRepository.findById(productId);

        // Barcode Making
        String barcode = "12345623124";
        try {
            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix bitMatrix = qrCodeWriter.encode(barcode, BarcodeFormat.QR_CODE, 300, 300);

            BufferedImage bufferedImage = new BufferedImage(bitMatrix.getWidth(), bitMatrix.getHeight(), BufferedImage.TYPE_INT_RGB);
            for (int x = 0; x < bitMatrix.getWidth(); x++) {
                for (int y = 0; y < bitMatrix.getHeight(); y++) {
                    bufferedImage.setRGB(x, y, bitMatrix.get(x, y) ? Color.BLACK.getRGB() : Color.WHITE.getRGB());
                }
            }

            File outputFile = new File("/Users/sanghee/Desktop/qrcode.png");
            ImageIO.write(bufferedImage, "png", outputFile);

            System.out.println("QR code image created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
