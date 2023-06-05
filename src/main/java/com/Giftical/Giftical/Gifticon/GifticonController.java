package com.Giftical.Giftical.Gifticon;

import com.Giftical.Giftical.Store.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class GifticonController {
    private final GifticonService gifticonService;

//    @PostMapping("/user/store/payment")
//    public ResponseEntity<byte[]> buyGifticon(@RequestBody Store store){
//  Product Id, Auth?     return gifticonService.generateGifticon();
//        Return Image and what?
//    }
}
