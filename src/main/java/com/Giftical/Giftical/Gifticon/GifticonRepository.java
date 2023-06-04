package com.Giftical.Giftical.Gifticon;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GifticonRepository extends JpaRepository<Gifticon, Object> {
}
