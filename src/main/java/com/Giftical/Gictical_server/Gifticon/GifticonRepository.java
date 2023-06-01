package com.Giftical.Gictical_server.Gifticon;

import com.Giftical.Gictical_server.Gifticon.Gifticon;
import com.Giftical.Gictical_server.Store.Store;

import java.util.List;

public interface GifticonRepository {

    Gifticon save(Gifticon gifticon);
    List<Gifticon> findByStore(Store store);
    int useGifticon(String barcode);
}
