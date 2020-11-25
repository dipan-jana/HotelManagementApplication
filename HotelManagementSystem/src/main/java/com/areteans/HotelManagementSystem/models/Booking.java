package com.areteans.HotelManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Booking {
    private long bookingId;
    private String bookingStatus;
    private User user;

}
