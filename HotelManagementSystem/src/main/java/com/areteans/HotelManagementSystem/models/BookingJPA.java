package com.areteans.HotelManagementSystem.models;

import com.areteans.HotelManagementSystem.enums.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "BOOKING_DETAILS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingJPA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingid;
    private long hotelid;
    private long userid;
    private String hotelname;
    private String city;
    private String bookingstatus;

    {
        bookingstatus = "CONFIRMED";
    }

}
