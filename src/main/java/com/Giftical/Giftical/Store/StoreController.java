package com.Giftical.Giftical.Store;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreService storeServices;
    @PostMapping("/vendor/store")
    public ResponseEntity<String> setStore(@RequestBody Store store){
        storeServices.save(store);
        return new ResponseEntity<>("Success", HttpStatus.valueOf(201));
    }
}
