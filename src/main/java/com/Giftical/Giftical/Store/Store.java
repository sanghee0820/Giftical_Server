package com.Giftical.Giftical.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long businessUserId;
    private String businessStoreNo;
    private String storeName;
    private String storeAddr;
    private String storeExplanation;
    private String storeContact;

    @Lob
    private byte[] storeImg;

    public Store(Long businessUserId, String businessStoreNo, String storeName, String storeAddr, String storeExplanation, String storeContact, String storeImg) {
        this.businessUserId = businessUserId;
        this.businessStoreNo = businessStoreNo;
        this.storeName = storeName;
        this.storeAddr = storeAddr;
        this.storeExplanation = storeExplanation;
        this.storeContact = storeContact;
        this.storeImg = storeImg.getBytes();
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr;
    }

    public void setStoreExplanation(String storeExplanation) {
        this.storeExplanation = storeExplanation;
    }

    public void setStoreContact(String storeContact) {
        this.storeContact = storeContact;
    }
}
