package com.Giftical.Giftical.BusinessUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    // business User Information
    private String businessUserId;
    private String businessUserPw;
    private String businessUserPhoneNum;
    //Bank
    private BusinessBank businessBankCode;
    private String businessBankAccount;

}
