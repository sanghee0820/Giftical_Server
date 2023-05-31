package com.Giftical.Gictical_server.repository;

import com.Giftical.Gictical_server.domain.Store;

import java.util.List;


public interface StoreRepository {

    void save(Store store);

    List<Store> getAllStore();
}
