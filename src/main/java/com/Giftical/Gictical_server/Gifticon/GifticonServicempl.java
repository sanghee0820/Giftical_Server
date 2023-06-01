package com.Giftical.Gictical_server.Gifticon;

import com.Giftical.Gictical_server.Store.Store;

import java.util.List;

public class GifticonServicempl implements GifticonService{
    private final GifticonRepository gifticonRepository= new MemoryGifticonRepository();

    @Override
    public Gifticon save(Gifticon gifticon) {
        gifticonRepository.save(gifticon);
        return gifticon;
    }

    @Override
    public List<Gifticon> findByStore(Store store) {

        return gifticonRepository.findByStore(store);
    }

    @Override
    public int useGifticon(String barcode) {
        return gifticonRepository.useGifticon(barcode);
    }
}
