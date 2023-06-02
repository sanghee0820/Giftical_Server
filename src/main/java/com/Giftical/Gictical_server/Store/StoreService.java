package com.Giftical.Gictical_server.Store;

import com.Giftical.Gictical_server.Store.Store;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StoreService {

    void join(Store store);
    List<Store> getAllStore();

}
