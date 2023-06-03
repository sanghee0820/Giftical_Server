package com.Giftical.Giftical.Store;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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
        Store store2 = new Store();

        store2.setStoreName("store");
        store2.setBusinessStoreNo("1234523");
        storeServices.save(store1);
        storeServices.save(store2);

        return store1;
    }

    @GetMapping("/vendor/store/find/{storename}")
    List<Store> findStore(@PathVariable String storename){
        List<Store> finded = storeServices.findByName(storename);
        return finded;
    }
}
