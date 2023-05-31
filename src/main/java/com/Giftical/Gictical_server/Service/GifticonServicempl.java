package com.Giftical.Gictical_server.Service;

import com.Giftical.Gictical_server.domain.Gifticon;
import com.Giftical.Gictical_server.domain.Store;
import com.Giftical.Gictical_server.repository.GifticonRepository;
import com.Giftical.Gictical_server.repository.MemoryGifticonRepository;

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
