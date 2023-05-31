package com.Giftical.Gictical_server.Service;

import com.Giftical.Gictical_server.domain.Store;
import com.Giftical.Gictical_server.repository.MemoryStoreRepository;
import com.Giftical.Gictical_server.repository.StoreRepository;

import java.util.List;

public class StoreServiceImpl implements StoreService{

    private final StoreRepository storeRepository = new MemoryStoreRepository();
    @Override
    public void join(Store store) {
        storeRepository.save(store);
    }

    @Override
    public List<Store> getAllStore() {
        return storeRepository.getAllStore();
    }
}
