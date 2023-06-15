package com.Giftical.Giftical.Product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/vendor/store/product/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }
    @PostMapping("/user/store/info")
    public ResponseEntity<List<Product>> getProductList(@RequestBody HashMap<String, Long> info){
        return productService.getProductList(info.get("storeId"));
    }
}
