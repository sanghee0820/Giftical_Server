package com.Giftical.Gictical_server.Store;

import com.Giftical.Gictical_server.Store.Store;

import java.util.List;

public interface StoreService {

    void join(Store store);

    List<Store> getAllStore();

}
