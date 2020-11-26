package com.areteans.HotelManagementSystem.userRepo;

import com.areteans.HotelManagementSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {
}
