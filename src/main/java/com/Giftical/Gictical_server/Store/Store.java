package com.Giftical.Gictical_server.Store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import java.awt.*;
import java.util.List;
@Data
@Entity(name = "store")
public class Store {
    @Id
    private String businessStoreNo;
    private String storeName;
    private String storeAddr;
//    private short storeReigon;
    private String storeLattitude;
    private String storeLongtitude;
    private String storeExplanation;
    private String storeContact;
//    private List<Image> storePhoto;

    public Store() {
    }
    public Store(String businessStoreNO, String storeName, String storeAddr,
                 short storeReigon, String lattitude, /*String storeLattitude, */String storeLongtitude,
                 String storeExplanation, String storeContact) {
        this.businessStoreNo = businessStoreNO;
        this.storeName = storeName;
        this.storeAddr = storeAddr;
//        this.storeReigon = storeReigon;
        this.storeLattitude = storeLattitude;
        this.storeLongtitude = storeLongtitude;
        this.storeExplanation = storeExplanation;
        this.storeContact = storeContact;
//        this.storePhoto = (List<Image>) storePhoto;
    }



    public void setStoreAddr(String storeAddr, short storeReigon,
                             String storeLattitude, String storeLongtitude, boolean auth) {

        this.storeAddr = storeAddr;
//        this.storeReigon = storeReigon;
        this.storeLattitude = storeLattitude;
        this.storeLongtitude = storeLongtitude;
    }

    @Override
    public String toString() {
        return "Store{" +
                "businessStoreNo='" + businessStoreNo + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeAddr='" + storeAddr + '\'' +
//                ", storeReigon=" + storeReigon +
                ", storeLattitude='" + storeLattitude + '\'' +
                ", storeLongtitude='" + storeLongtitude + '\'' +
                ", storeExplanation='" + storeExplanation + '\'' +
                ", storeContact='" + storeContact + '\'' +
//                ", storePhoto=" + storePhoto +
                '}';
    }
}
