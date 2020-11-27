package com.areteans.HotelManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
public class HotelJPA {

    private long hotelId;
    private String city;
    private String hotelName;
    private int rooms;
    private String landmark;

}
