package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    ResponseEntity<User> login(String userId, String userPw) {

        Optional<User> findUser = Optional.ofNullable(userRepository.findByuserId(userId));

        if(findUser.isEmpty()) return new ResponseEntity<>(null,
                HttpStatus.valueOf(401));
        if(!findUser.get().getUserPw().equals(userPw)) return new ResponseEntity<>(null,
                HttpStatus.valueOf(401));

        return new ResponseEntity<>(findUser.get(), HttpStatus.valueOf(200));
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
