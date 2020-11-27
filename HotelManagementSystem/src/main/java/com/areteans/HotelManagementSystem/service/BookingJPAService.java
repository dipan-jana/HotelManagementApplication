package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.BookingJPA;
import com.areteans.HotelManagementSystem.models.HotelJPA;
import com.areteans.HotelManagementSystem.repository.BookRepo;
import com.areteans.HotelManagementSystem.repository.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookingJPAService {
    private final HotelRepo hotelRepo;
    private final BookRepo bookRepo;

    public HotelJPA getHotelAttributes(long hotelid) {
        Optional<HotelJPA> optionalHotelJPA = hotelRepo.findById(hotelid);
        return optionalHotelJPA.orElse(null);
    }

    public BookingJPA createBooking(BookingJPA bookingJPA) {
        return bookRepo.save(b);
    }

}
