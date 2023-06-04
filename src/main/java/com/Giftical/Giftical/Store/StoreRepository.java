package com.Giftical.Giftical.Store;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Object> {
    List<Store> findByBusinessUserId(Long id);
}
