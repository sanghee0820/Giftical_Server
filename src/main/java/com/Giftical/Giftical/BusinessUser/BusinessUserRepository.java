package com.Giftical.Giftical.BusinessUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessUserRepository extends JpaRepository<BusinessUser, Object> {
    public BusinessUser findByBusinessUserId(String id);
}
