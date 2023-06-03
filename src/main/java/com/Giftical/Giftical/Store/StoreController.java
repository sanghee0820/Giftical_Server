package com.Giftical.Giftical.Store;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final StoreServices storeServices;

    @GetMapping("/vendor/store/add")
    Store addStore(){
        Store store1 = new Store();
        store1.setStoreName("store");
        store1.setBusinessStoreNo("12345");
        return storeServices.save(store1);
    }

    @GetMapping("/vendor/store/find/{BusinessNum}")
    Optional<Store> findStore(@PathVariable String BusinessNum){
        Optional<Store> finded = storeServices.findById(BusinessNum);
        return finded;
    }
}
