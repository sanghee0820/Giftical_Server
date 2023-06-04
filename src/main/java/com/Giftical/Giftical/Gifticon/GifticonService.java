package com.Giftical.Giftical.Gifticon;

import com.Giftical.Giftical.Product.Product;
import com.Giftical.Giftical.Product.ProductRepository;
import com.Giftical.Giftical.Store.StoreRepository;
import com.Giftical.Giftical.User.UserRepository;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
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

    public Object generateGifticon(Long productId){
        Optional<Product> product = productRepository.findById(productId);
        if(product.isEmpty()) return false;


        // Barcode Making
        String barcode = "12345623124";

        BitMatrix bitMatrix = new Code128Writer().encode(barcode, BarcodeFormat.CODE_128, 300, 100, null);
        BufferedImage bufferedImage = new BufferedImage(bitMatrix.getWidth(), bitMatrix.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();

        for (int x = 0; x < bitMatrix.getWidth(); x++) {
            for (int y = 0; y < bitMatrix.getHeight(); y++) {
                bufferedImage.setRGB(x, y, bitMatrix.get(x, y) ? Color.BLACK.getRGB() : Color.WHITE.getRGB());
            }
        }

        BufferedImage fullImage = new BufferedImage(600, 1000, BufferedImage.TYPE_INT_RGB);
        Graphics2D fullGraphics = (Graphics2D) fullImage.getGraphics();
        fullGraphics.setColor(Color.WHITE);
        fullGraphics.fillRect(0, 0, 600, 1000);

        fullGraphics.drawImage(bufferedImage, fullImage.getWidth()/2 - 150, fullImage.getHeight()-200, null);
        fullGraphics.setColor(Color.BLACK);
        fullGraphics.setFont(new Font("Arial", Font.BOLD, 20));
        fullGraphics.drawString(barcode, fullImage.getWidth()/2 - barcode.length()/2*10 - 10, fullImage.getHeight()-75);
        File outputFile = new File("/Users/isanghui/Desktop/barcode.png");
        try {
            ImageIO.write(fullImage, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bufferedImage;
    }
}
