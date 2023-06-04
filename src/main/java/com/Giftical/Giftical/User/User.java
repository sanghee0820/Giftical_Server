package com.Giftical.Giftical.User;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    //user Information
    private String userId;
    private String userPw;
    private String userName;
    private String userPhoneNum;

    public void setterPhoneNum(String userPhoneNum){ this.userPhoneNum = userPhoneNum; }
    public void setterPw(String userPw){ this.userPw = userPw; }

}
