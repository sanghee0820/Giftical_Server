package com.Giftical.Gictical_server.Store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreServiceImpl implements StoreService{
    private final StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public void join(Store store) {
        storeRepository.save(store);
    }

    @Override
    public List<Store> getAllStore() {
        return storeRepository.findAll().stream().toList();
    }
}
