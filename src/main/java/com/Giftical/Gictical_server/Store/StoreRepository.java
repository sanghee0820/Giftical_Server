package com.Giftical.Gictical_server.Store;

import com.Giftical.Gictical_server.Store.Store;

import java.util.List;


public interface StoreRepository {

    void save(Store store);

    List<Store> getAllStore();
}
