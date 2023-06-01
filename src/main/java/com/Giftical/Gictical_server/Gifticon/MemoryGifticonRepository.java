package com.Giftical.Gictical_server.Gifticon;

import com.Giftical.Gictical_server.Store.Store;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryGifticonRepository implements GifticonRepository{

    private Map<String, Gifticon> giftMemory = new ConcurrentHashMap<>();

    @Override
    public Gifticon save(Gifticon gifticon) {
        giftMemory.put(gifticon.getStoreBusinessNo(), gifticon);
        return gifticon;
    }

    @Override
    public List<Gifticon> findByStore(Store store) {
        List<Gifticon> storeGifticon = giftMemory.values().stream().toList();
        return storeGifticon;
    }

    @Override
    public int useGifticon(String barcode) {
        Date today = Date.valueOf(LocalDate.now());
        System.out.println(today);
        return 0;
    }
}
