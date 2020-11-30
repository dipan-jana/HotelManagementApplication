package com.areteans.HotelManagementSystem.controller;


import com.areteans.HotelManagementSystem.models.HotelJPA;
import com.areteans.HotelManagementSystem.service.HotelJPAService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "hotel")
public class HotelController {

    private final HotelJPAService hotelJPAService;

    @PostMapping(path = "inserthotel" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public HotelJPA createHotel(@RequestBody HotelJPA hotelJPA) {
        return hotelJPAService.putHotel(hotelJPA);
    }

    @GetMapping(path = "gethoteldata" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public HotelJPA getHotelData(@RequestParam(value = "hotelid") long hotelid) {
        return this.hotelJPAService.getHotelByID(hotelid);
    }

    @DeleteMapping(value = "deletehotel/{hotelid}")
    public void deleteHotel(@PathVariable("hotelid") long hotelid) {

        hotelJPAService.deleteHotelRecord(hotelid);
    }

}
