package com.areteans.HotelManagementSystem.controller;

//import com.areteans.HotelManagementSystem.models.Booking;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "bookingconsole")
public class BookingController {
//    private final BookingService bookingService;
//
//    @PostMapping(path = "booking" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Booking putBooking(@RequestBody Booking booking) {
//        return bookingService.createBooking(booking);
//    }


}
