package com.areteans.HotelManagementSystem.controller;
import com.areteans.HotelManagementSystem.models.BookingJPA;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.service.BookingJPAService;
import com.areteans.HotelManagementSystem.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "bookingconsole")
public class BookingController {

    private final BookingJPAService bookingJPAService;

    @PostMapping(path = "booking" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookingJPA putBooking(@RequestBody Long userid, Long hotelid) {
        return bookingJPAService.createBooking(userid, hotelid);
    }
}
