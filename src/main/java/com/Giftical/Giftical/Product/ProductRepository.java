package com.Giftical.Giftical.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Object> {
    List<Product> findByStoreId(Long storeId);
}
