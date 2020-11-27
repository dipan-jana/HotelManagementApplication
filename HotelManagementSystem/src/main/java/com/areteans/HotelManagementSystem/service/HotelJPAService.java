package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.HotelJPA;
import com.areteans.HotelManagementSystem.repository.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelJPAService {
//    private final HotelJPA hotelJPA;

    private final HotelRepo hotelRepo;

    public HotelJPA putHotel(HotelJPA hotelJPA) {
        return hotelRepo.save(hotelJPA);
    }

}
