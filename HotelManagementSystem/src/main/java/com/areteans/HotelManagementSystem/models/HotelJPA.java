package com.areteans.HotelManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HotelJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelid;
    private String city;
    private String hotelName;
    private int rooms;
    private String landmark;

}
