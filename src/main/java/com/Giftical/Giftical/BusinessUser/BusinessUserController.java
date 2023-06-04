package com.Giftical.Giftical.BusinessUser;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class BusinessUserController {
    private final BusinessUserService businessUserService;
}
