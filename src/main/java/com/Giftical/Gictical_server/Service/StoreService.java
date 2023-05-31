package com.Giftical.Gictical_server.Service;

import com.Giftical.Gictical_server.domain.Store;

import java.util.List;

public interface StoreService {

    void join(Store store);

    List<Store> getAllStore();

}
