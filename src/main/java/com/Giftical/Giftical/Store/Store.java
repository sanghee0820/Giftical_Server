package com.Giftical.Giftical.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public Store(Long businessUserId, String businessStoreNo){
        this.businessUserId = businessUserId;
        this.businessStoreNo = businessStoreNo;
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
