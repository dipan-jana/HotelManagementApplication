package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.HotelJPA;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelJPAService {
    private final HotelJPA hotelJPA;
}
