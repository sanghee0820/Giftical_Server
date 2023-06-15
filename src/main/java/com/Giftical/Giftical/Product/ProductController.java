package com.Giftical.Giftical.Product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

//    @PostMapping("/vendor/store/product/add")
//    public ResponseEntity<Product> addProduct(@ResponseBody)
}
