package com.areteans.HotelManagementSystem.service;


import com.areteans.HotelManagementSystem.models.Booking;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.repository.BookingRepository;
import com.areteans.HotelManagementSystem.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {




    private final BookingRepository bookingRepository;
    private final UserRepo userRepo;

    public Booking createBooking(Booking booking) {
        return bookingRepository.create(booking);
    }



}
