package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/user/login")
//    public User login(@RequestParam String userId, @RequestParam String userPw,
//                      @RequestParam String userName, @RequestParam String userPhoneNum){
//        return new User(userId, userPw, userName, userPhoneNum);
//}
    public User login(@RequestBody User user){
        return user;
    }

}
