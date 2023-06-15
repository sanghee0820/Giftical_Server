package com.Giftical.Giftical.Product;


import com.Giftical.Giftical.Store.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final StoreRepository storeRepository;

    public ResponseEntity<Product> addProduct(Product product){
        Product newProduct = productRepository.save(product);
        return new ResponseEntity<>(newProduct, HttpStatus.valueOf(200));
    }

    public ResponseEntity<List<Product>> getProductList(Long storeId){
        List<Product> finded = productRepository.findByStoreId(storeId);
        return new ResponseEntity<>(finded, HttpStatus.valueOf(200));
    }

}
