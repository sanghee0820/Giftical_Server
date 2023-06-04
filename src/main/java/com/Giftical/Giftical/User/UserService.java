package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    UserLogin login(User login_user) {
        Optional<User> findUser = userRepository.findById(login_user.getUserId());
        if(findUser.isEmpty()) return UserLogin.Error_No_match_Id;
        if(findUser.get().getUserPw() == login_user.getUserPw()) return UserLogin.Error_Pw;
        return UserLogin.Success;
    }
}
