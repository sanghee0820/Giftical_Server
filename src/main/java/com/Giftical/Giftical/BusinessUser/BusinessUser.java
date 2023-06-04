package com.Giftical.Giftical.BusinessUser;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BusinessUser {
    @Id
    private String businessUserId;
    private String businessUserPw;
    private String businessUserPhoneNum;
    //Bank
    private BusinessBank businessBankCode;
    private String businessBankAccount;

}
