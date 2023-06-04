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
    //    private short storeReigon;
//    private String storeLattitude;
//    private String storeLongtitude;
    private String storeExplanation;
    private String storeContact;


    public void setStoreAddr(String storeAddr, short storeReigon,
                             String storeLattitude, String storeLongtitude, boolean auth) {

        this.storeAddr = storeAddr;
//        this.storeReigon = storeReigon;
//        this.storeLattitude = storeLattitude;
//        this.storeLongtitude = storeLongtitude;
    }

}
