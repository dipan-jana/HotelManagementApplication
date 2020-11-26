package com.areteans.HotelManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Hotel")
@Getter
@Setter
@AllArgsConstructor
public class HotelJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hotelId;
    private String city;
    private String hotelName;
    private int rooms;
    private String landmark;

}
