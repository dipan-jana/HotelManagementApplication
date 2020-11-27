package com.areteans.HotelManagementSystem.controller;

//import com.areteans.HotelManagementSystem.models.Booking;
import com.areteans.HotelManagementSystem.models.BookingJPA;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.service.BookingJPAService;
import com.areteans.HotelManagementSystem.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "bookingconsole")
public class BookingController {
    private final BookingJPAService bookingJPAService;

    @PostMapping(path = "getbooking" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookingJPA createBookingData(@RequestBody long hotelid, long userid) {
        return bookingJPAService.createBooking(hotelid, userid);
    }

















//    private final BookingService bookingService;
//
//    @PostMapping(path = "booking" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Booking putBooking(@RequestBody Booking booking) {
//        return bookingService.createBooking(booking);
//    }


}
