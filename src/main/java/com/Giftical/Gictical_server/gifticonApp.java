package com.Giftical.Gictical_server;

import com.Giftical.Gictical_server.Service.GifticonService;
import com.Giftical.Gictical_server.Service.GifticonServicempl;
import com.Giftical.Gictical_server.domain.Gifticon;
import com.Giftical.Gictical_server.domain.Store;

import java.sql.Date;
import java.time.LocalDate;
import java.sql.Date.*;
import java.util.List;


public class gifticonApp {
    public static void main(String[] args) {
        GifticonService gifticonService = new GifticonServicempl();

        Gifticon gifticon1 = new Gifticon("12345","123456",false,
                Date.valueOf(LocalDate.now()),Date.valueOf(LocalDate.now()), Date.valueOf(LocalDate.now()), 3000,null);

        Store store1 = new Store("12345", "store1", "Daegu", (short) 3,
                "1234", "1234", "1234"
                , "store1", "234");
        gifticonService.save(gifticon1);
        List<Gifticon> gifticonList = gifticonService.findByStore(store1);

        System.out.println(gifticonList.get(0));

    }
}
