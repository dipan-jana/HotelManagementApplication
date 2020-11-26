package com.areteans.HotelManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "BOOKING_DETAILS")
@Getter
@Setter
@AllArgsConstructor
public class BookingJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;
    private long hotelid;
    private long userid;
    private String hotelname;
    private String city;
    private String bookingStatus;
//    private UserJPA userJPA;
//    private HotelJPA hotelJPA;
}
