package com.areteans.HotelManagementSystem.controller;
import com.areteans.HotelManagementSystem.models.BookingJPA;
import com.areteans.HotelManagementSystem.service.BookingJPAService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "bookingconsole")
public class BookingController {

    private final BookingJPAService bookingJPAService;

    @PostMapping(path = "booking" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookingJPA putBooking(@RequestBody Map<String, Long> inputMap) {
        long userid = inputMap.get("userid");
        long hotelid = inputMap.get("hotelid");
        return bookingJPAService.createBooking(hotelid, userid);
    }

    @GetMapping(path = "viewbooking" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public BookingJPA viewBooking(@RequestParam( value = "bookingid") Long bookingid) {
        return bookingJPAService.viewBookingByID(bookingid);
    }

    @DeleteMapping(value = "deletebooking/{bookingid}")
    public void deleteBooking(@PathVariable("bookingid") Long bookingid) {
        bookingJPAService.deleteBookingRecord(bookingid);

    }

}
