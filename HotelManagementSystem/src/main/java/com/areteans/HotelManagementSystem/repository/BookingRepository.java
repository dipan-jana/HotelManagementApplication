package com.areteans.HotelManagementSystem.repository;

//import com.areteans.HotelManagementSystem.models.Booking;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Repository

public class BookingRepository {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    public BookingRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public Booking create(Booking booking) {
//
//        Map<String, Object> userMap = jdbcTemplate.queryForMap("SELECT * FROM USER_DETAILS(username, mobilenumber, gender WHERE userid =?) values(?) returning userid, username, mobilenumber, gender",
//                booking.getUser().getUserId(),
//                booking.getUser().getUserName(),
//                booking.getUser().getMobileNumber(),
//                booking.getUser().getGender());
//
//        jdbcTemplate.update("insert into BOOKING_DETAILS (bookingid, bookingstatus, userid, username, mobilenumber, gender) values(?,?,?,?,?,?) ",
//                booking.getBookingId(),
//                booking.getBookingStatus(),
//                userMap.get("userId"),
//                userMap.get("userName"),
//                userMap.get("mobileNumber"),
//                userMap.get("gender"));
//
//        Map<String, Object> userMap = jdbcTemplate.queryForMap("SELECT * FROM USER_DETAILS(username, mobilenumber, gender WHERE userid =?) values(?) returning userid, username, mobilenumber, gender",
//                booking.getUser().getUserId(),
//                booking.getUser().getUserName(),
//                booking.getUser().getMobileNumber(),
//                booking.getUser().getGender());
//        return booking;
//    }




}
