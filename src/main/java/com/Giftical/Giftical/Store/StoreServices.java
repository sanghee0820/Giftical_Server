package com.Giftical.Giftical.Store;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreServices {

    private final StoreRepository storeRepository;

    Store save(Store store){
        return storeRepository.save(store);
    }
    List<Store> findByName(String storename){
        return storeRepository.findByStoreName(storename);
    }
    Optional<Store> findById(String BusinessNum){
        return storeRepository.findById(BusinessNum);
    }
}
