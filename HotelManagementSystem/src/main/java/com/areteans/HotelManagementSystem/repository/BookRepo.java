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


//    @Query(value = "INSERT into BOOKING_DETAILS (hotelid, userid, hotelname, city, bookingstatus) " +
//           "values (:hotelid,:userid,:hotelname,:city,:bookingstatus)", nativeQuery = true)
//    @Modifying
//    @Transactional
//    Optional<BookingJPA> createBookingDetails(@Param("hotelid") long hotelid, @Param("userid") long userid, "hotelname", "city", "bookingstatus") ,
//                                              , String hotelname, String city, String bookingstatus);

}
