package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    ResponseEntity<User> login(String userId, String userPw) {
        Optional<User> findUser = Optional.ofNullable(userRepository.findByuserId(userId));
        log.println(userId);
        log.println(userPw);
        if(findUser.isEmpty()) return new ResponseEntity<>(null,
                HttpStatus.valueOf(HttpStatus.NON_AUTHORITATIVE_INFORMATION.value()));
        if(findUser.get().getUserPw() == userPw) return new ResponseEntity<>(null,
                HttpStatus.valueOf(HttpStatus.NON_AUTHORITATIVE_INFORMATION.value()));

        return new ResponseEntity<>(findUser.get(), HttpStatus.ACCEPTED);
    }

    @Transactional
    User join(User user){
        User newUser = userRepository.save(user);
        return newUser;
    }

    @Transactional
    User search(Long userPk){
        Optional<User> findUser = userRepository.findById(userPk);
        if(findUser.isEmpty()) return null;
        return findUser.get();
    }
}
