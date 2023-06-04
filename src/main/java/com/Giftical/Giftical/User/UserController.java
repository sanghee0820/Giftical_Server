package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/user/login")
    public User login(@RequestBody User user){
        return user;
    }

}
