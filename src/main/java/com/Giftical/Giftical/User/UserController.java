package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/user/login")
    public ResponseEntity<User> login(@RequestBody HashMap<String, String> user){
        log.println(user.get("userId"));
        log.println(user.get("userPw"));
        return userService.login(user.get("userId"), user.get("userPw"));
    }

    @PostMapping("/user/join")
    public ResponseEntity<User> join(@RequestBody User user){
        User newUser = userService.join(user);
        return new ResponseEntity<>(newUser, HttpStatus.valueOf(200));
    }
    @PostMapping("/user/info")
    public ResponseEntity<User> search(@RequestBody HashMap<String, Long> userPk){
        log.println(userPk.get("userPk"));
        return new ResponseEntity<>(userService.search(userPk.get("userPk")), HttpStatus.OK);
    }

}
