package com.Giftical.Giftical.BusinessUser;

import com.Giftical.Giftical.Store.Store;
import com.Giftical.Giftical.Store.StoreRepository;
import com.Giftical.Giftical.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BusinessUserService {
    private final BusinessUserRepository businessUserRepository;
    private final StoreRepository storeRepository;

    public ResponseEntity<BusinessUser> join(BusinessJoinDTO user) {
        BusinessUser newUser = new BusinessUser(null, user.getBusinessUserId(),
                user.getBusinessUserPw(), user.getBusinessBankAccount(), user.getBusinessBankCode(),
                user.getBusinessUserPhoneNum());

        // ID 겹침
        if( businessUserRepository.findByBusinessUserId( newUser.getBusinessUserId()) == null ) {
            newUser = businessUserRepository.save(newUser);
            storeRepository.save(new Store(newUser.getId(), user.getBusinessStoreNo()));
            return new ResponseEntity<>( newUser, HttpStatus.valueOf(200));
        }

        return new ResponseEntity<>(null, HttpStatus.valueOf(401));
    }
    public ResponseEntity<List<Store>> login(String id, String pw){
        Optional<BusinessUser> found = Optional.ofNullable( businessUserRepository.findByBusinessUserId(id));

        // Wrong id
        if( found.isEmpty() ) return new ResponseEntity<>(null, HttpStatus.valueOf(400));
            //Wrong pw
        if( !found.get().getBusinessUserPw().equals(pw)){
            return new ResponseEntity<>(null, HttpStatus.valueOf(401));
        }
        return new ResponseEntity<>( storeRepository.findByBusinessUserId(found.get().getId()), HttpStatus.valueOf(200));
    }
}
