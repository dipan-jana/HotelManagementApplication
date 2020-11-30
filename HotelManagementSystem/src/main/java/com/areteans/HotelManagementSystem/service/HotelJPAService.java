package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.HotelJPA;
import com.areteans.HotelManagementSystem.repository.HotelRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelJPAService {

    private final HotelRepo hotelRepo;

    public HotelJPA putHotel(HotelJPA hotelJPA) {

        return hotelRepo.save(hotelJPA);
    }

    public HotelJPA getHotelByID(Long hotelid) {

        Optional<HotelJPA> obj = hotelRepo.findById(hotelid);
        return obj.orElse(null);
    }

    public void deleteHotelRecord(long hotelid) {

        hotelRepo.deleteById(hotelid);
    }

}
