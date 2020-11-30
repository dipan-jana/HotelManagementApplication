package com.areteans.HotelManagementSystem.repository;

import com.areteans.HotelManagementSystem.models.BookingJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookingJPA, Long> {
}
