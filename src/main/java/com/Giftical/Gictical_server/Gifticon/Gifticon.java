package com.Giftical.Gictical_server.Gifticon;

import java.awt.*;
import java.sql.Date;

public class Gifticon {
    private String StoreBusinessNo;
    private String giftBarcode;
    private boolean giftUsed;
    private Date giftUsedDate;
    private Date giftGenerateDate;
    private Date giftEndDate;
    private int giftCost;
    private Image giftImage;

    public Gifticon(String storeBusinessNo, String giftBarcode,
                    boolean giftUsed, Date giftUsedDate,
                    Date giftGenerateDate, Date giftEndDate,
                    int giftCost, Image giftImage) {
        this.StoreBusinessNo = storeBusinessNo;
        this.giftBarcode = giftBarcode;
        this.giftUsed = giftUsed;
        this.giftUsedDate = giftUsedDate;
        this.giftGenerateDate = giftGenerateDate;
        this.giftEndDate = giftEndDate;
        this.giftCost = giftCost;
        this.giftImage = giftImage;
    }

    public String getStoreBusinessNo() {
        return StoreBusinessNo;
    }

    public String getGiftBarcode() {
        return giftBarcode;
    }

    public boolean isGiftUsed() {
        return giftUsed;
    }

    public Date getGiftUsedDate() {
        return giftUsedDate;
    }

    public Date getGiftGenerateDate() {
        return giftGenerateDate;
    }

    public Date getGiftEndDate() {
        return giftEndDate;
    }

    public int getGiftCost() {
        return giftCost;
    }

    public Image getGiftImage() {
        return giftImage;
    }

    public void setGiftBarcode(String giftBarcode) {
        this.giftBarcode = giftBarcode;
    }

    public void setgiftUsed(boolean giftUsed) {
        this.giftUsed = giftUsed;
    }

    public void setGiftUsedDate(Date giftUsedDate) {
        this.giftUsedDate = giftUsedDate;
    }

    public void setGiftGenerateDate(Date giftGenerateDate) {
        this.giftGenerateDate = giftGenerateDate;
    }

    public void setGiftEndDate(Date giftEndDate) {
        this.giftEndDate = giftEndDate;
    }

    public void setGiftCost(int giftCost) {
        this.giftCost = giftCost;
    }

    public void setGiftImage(Image giftImage) {
        this.giftImage = giftImage;
    }

    @Override
    public String toString() {
        return "Gifticon{" +
                "StoreBusinessNo='" + StoreBusinessNo + '\'' +
                ", giftBarcode='" + giftBarcode + '\'' +
                ", giftUsed=" + giftUsed +
                ", giftUsedDate=" + giftUsedDate +
                ", giftGenerateDate=" + giftGenerateDate +
                ", giftEndDate=" + giftEndDate +
                ", giftCost=" + giftCost +
                ", giftImage=" + giftImage +
                '}';
    }
}
