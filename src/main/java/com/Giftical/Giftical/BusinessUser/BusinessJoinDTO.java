package com.Giftical.Giftical.BusinessUser;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class BusinessJoinDTO {
    private String businessUserId;
    private String businessUserPw;
    private String businessUserPhoneNum;
    //Bank
    private BusinessBank businessBankCode;
    private String businessBankAccount;
    private String businessStoreNo;

    // Store Inform
    private String storeName;
    private String storeAddr;
    private String storeExplanation;
    private String storeContact;
    private String storeImg;
}
