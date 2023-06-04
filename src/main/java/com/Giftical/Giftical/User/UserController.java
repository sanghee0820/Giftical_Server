package com.Giftical.Giftical.User;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/user/login")
    public ResponseEntity<User> Test(@RequestBody User user){
        return new ResponseEntity<>(user, HttpStatus.valueOf(303));
    }

}
