package com.Giftical.Giftical.User;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class User {
    @Id
    private String userName;
}
