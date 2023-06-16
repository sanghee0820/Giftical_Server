package com.Giftical.Giftical.Gifticon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Gifticon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Connect with User
    private Long userId;
    private Long storeId;
    private Long productId;


    // gifticon information
    private String barcode;
    private int giftCost;

    // With Gifticon Use
    private Boolean giftUsedValue;
    private Date giftUsedDate;

    // Buy date, end tate,
    private Date giftGenerateDate;
    private Date giftEndDate;



}
