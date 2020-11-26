package com.areteans.HotelManagementSystem.repository;

import com.areteans.HotelManagementSystem.models.HotelJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<HotelJPA, Long> {
}
