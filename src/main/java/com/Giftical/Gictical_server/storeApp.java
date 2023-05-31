package com.Giftical.Gictical_server;

import com.Giftical.Gictical_server.Service.StoreService;
import com.Giftical.Gictical_server.Service.StoreServiceImpl;
import com.Giftical.Gictical_server.domain.Store;

import java.util.List;

public class storeApp {
    public static void main(String[] args) {
        StoreService storeService = new StoreServiceImpl();


        Store store1 = new Store("123456", "Store1", "Daegu",
                (short) 1, "1", "1", "Test",
                "010-0000-000", null);
        Store store2 = new Store("657565", "Store1", "Daegu",
                (short) 1, "1", "1", "Test",
                "010-0000-000", null);
        storeService.join(store1);
        storeService.join(store2);

        List<Store> allStore = storeService.getAllStore();
        for(int i = 0; i < allStore.size(); i++){
            System.out.println(allStore.get(i));
        }

    }
}
