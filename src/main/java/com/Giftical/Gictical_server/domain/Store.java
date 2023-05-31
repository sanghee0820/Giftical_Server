package com.Giftical.Gictical_server.domain;

import java.awt.*;
import java.util.List;

public class Store {
    private String businessStoreNo;
    private String storeName;
    private String storeAddr;
    private short storeReigon;
    private String storeLattitude;
    private String storeLongtitude;
    private String storeExplanation;
    private String storeContact;
    private List<Image> storePhoto;

    public Store(String businessStoreNO, String storeName, String storeAddr,
                 short storeReigon, String lattitude, String storeLattitude, String storeLongtitude,
                 String storeExplanation, String storeContact) {
        this.businessStoreNo = businessStoreNO;
        this.storeName = storeName;
        this.storeAddr = storeAddr;
        this.storeReigon = storeReigon;
        this.storeLattitude = storeLattitude;
        this.storeLongtitude = storeLongtitude;
        this.storeExplanation = storeExplanation;
        this.storeContact = storeContact;
        this.storePhoto = (List<Image>) storePhoto;
    }

    public String getBusinessStoreNo() {
        return businessStoreNo;
    }
    public String getStoreName() {
        return storeName;
    }

    public String getStoreAddr() {
        return storeAddr;
    }

    public short getStoreReigon() {
        return storeReigon;
    }

    public String getStoreLattitude() {
        return storeLattitude;
    }

    public String getStoreLongtitude() {
        return storeLongtitude;
    }

    public String getStoreExplanation() {
        return storeExplanation;
    }

    public String getStoreContact() {
        return storeContact;
    }

    public List<Image> getStorePhoto() {
        return storePhoto;
    }

    public void setStoreName(String storeName, boolean auth) {
        if( auth ) this.storeName = storeName;
    }

    public void setStoreAddr(String storeAddr, short storeReigon,
                             String storeLattitude, String storeLongtitude, boolean auth) {

        this.storeAddr = storeAddr;
        this.storeReigon = storeReigon;
        this.storeLattitude = storeLattitude;
        this.storeLongtitude = storeLongtitude;
    }

    public void setStoreExplanation(String storeExplanation, boolean auth) {
        this.storeExplanation = storeExplanation;
    }

    public void setStoreContact(String storeContact, boolean auth) {
        this.storeContact = storeContact;
    }

    @Override
    public String toString() {
        return "Store{" +
                "businessStoreNo='" + businessStoreNo + '\'' +
                ", storeName='" + storeName + '\'' +
                ", storeAddr='" + storeAddr + '\'' +
                ", storeReigon=" + storeReigon +
                ", storeLattitude='" + storeLattitude + '\'' +
                ", storeLongtitude='" + storeLongtitude + '\'' +
                ", storeExplanation='" + storeExplanation + '\'' +
                ", storeContact='" + storeContact + '\'' +
                ", storePhoto=" + storePhoto +
                '}';
    }
}
