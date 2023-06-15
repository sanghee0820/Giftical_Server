package com.Giftical.Giftical.Store;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {

    private final StoreRepository storeRepository;

    Store save(Store store){
        return storeRepository.save(store);
    }
    Optional<Store> findById(String BusinessNum){
        return storeRepository.findById(BusinessNum);
    }

    List<StoreoutDTO> findAllStore(){
        List<Store> stores = storeRepository.findAll();
        List<StoreoutDTO> storeoutDTOs = new ArrayList<>();
        for(int i = 0; i < stores.size(); i++){
            storeoutDTOs.add(new StoreoutDTO(stores.get(i).getStoreName(), stores.get(i).getStoreImg()));
        }
        return storeoutDTOs;
    }
}
