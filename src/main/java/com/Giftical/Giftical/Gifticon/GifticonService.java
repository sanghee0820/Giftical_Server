package com.Giftical.Giftical.Gifticon;

import com.Giftical.Giftical.Store.StoreRepository;
import com.Giftical.Giftical.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GifticonService {
    private final GifticonRepository gifticonRepository;
    private final UserRepository userRepository;
    private final StoreRepository storeRepository;
}
