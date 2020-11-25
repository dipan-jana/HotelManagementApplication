package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.Booking;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class BookingService {
    private final JdbcTemplate jdbcTemplate;

    public Booking create(Booking booking) {
        Map<String, Object> userMap = jdbcTemplate.queryForMap("insert into USER_DETAILS(username, mobilenumber, gender) values(?,?,?) returning userid, username, mobilenumber",
                booking.getUser().getUserId(),
                booking.getUser().getUserName(),
                booking.getUser().getMobileNumber(),
                booking.getUser().getGender());

        jdbcTemplate.update("insert into BOOKING_DETAILS (bookingid,bookingstatus,hotelid,hotelname,city)values(?,?,?,?,?) ",
                booking.getBookingId(),
                booking.getBookingStatus(),
                userMap.get("userId"),
                userMap.get("userName"),
                userMap.get("mobileNumber"),
                userMap.get("gender"));
        return booking;
    }
}
