package com.Giftical.Giftical.Store;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeServices;
    @PostMapping("/vendor/store/add")
    public ResponseEntity<String> setStore(@RequestBody Store store){
        storeServices.save(store);
        return new ResponseEntity<>("Success", HttpStatus.valueOf(201));
    }
    @PostMapping("/user/store/search")
    public ResponseEntity<List<StoreoutDTO>> searchStore(){
        return new ResponseEntity<>(storeServices.findAllStore(), HttpStatus.valueOf(200));
    }
}
