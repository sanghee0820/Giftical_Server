package com.Giftical.Gictical_server.Service;

import com.Giftical.Gictical_server.domain.Gifticon;
import com.Giftical.Gictical_server.domain.Store;

import java.util.List;

public interface GifticonService {

    Gifticon save(Gifticon gifticon);
    List<Gifticon> findByStore(Store store);
    int useGifticon(String barcode);
}
