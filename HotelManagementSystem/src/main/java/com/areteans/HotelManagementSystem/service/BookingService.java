package com.areteans.HotelManagementSystem.service;


import com.areteans.HotelManagementSystem.models.Booking;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.repository.BookingRepository;
import com.areteans.HotelManagementSystem.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookingService {




    private final BookingRepository bookingRepository;
    private final UserRepo userRepo;

    public Booking createBooking(Booking booking) {
        return bookingRepository.create(booking);
    }



}
