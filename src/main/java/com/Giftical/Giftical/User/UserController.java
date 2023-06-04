package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @RequestMapping(value = "/user/login")
//    @GetMapping("/user/login")
    public User login(User user){
        return user;
    }

}
