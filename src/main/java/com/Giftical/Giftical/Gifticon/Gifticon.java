package com.Giftical.Giftical.Gifticon;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Gifticon {
    @Id
    private String barcode;
    private boolean gifticonUsedValue;
}
