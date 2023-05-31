package com.Giftical.Gictical_server.repository;

import com.Giftical.Gictical_server.domain.Store;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryStoreRepository implements StoreRepository{

    private static Map<String, Store> storeMemory = new ConcurrentHashMap<>();
    @Override
    public void save(Store store) {
        storeMemory.put(store.getBusinessStoreNo(), store);
    }

    @Override
    public List<Store> getAllStore() {
        return storeMemory.values().stream().toList();
    }
}
