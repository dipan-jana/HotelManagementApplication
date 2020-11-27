package com.areteans.HotelManagementSystem.repository;

import com.areteans.HotelManagementSystem.models.BookingJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<BookingJPA, Long> {
}
