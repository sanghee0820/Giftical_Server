package com.Giftical.Giftical.Gifticon;

import com.Giftical.Giftical.Product.ProductGifticonDTO;
import com.Giftical.Giftical.Store.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class GifticonController {
    private final GifticonService gifticonService;

    @PostMapping("/user/store/product")
    public String buyProduct(@RequestBody GifticonmakeDTO gifticonmakeDTO){
        return gifticonService.buyProduct(gifticonmakeDTO);
    }

    @PostMapping("/vendor/store/payment")
    public ResponseEntity<Boolean> payGifticon(@RequestBody HashMap<String, String> info){
        return gifticonService.checkBarcode(info.get("barcode"));
    }
}
