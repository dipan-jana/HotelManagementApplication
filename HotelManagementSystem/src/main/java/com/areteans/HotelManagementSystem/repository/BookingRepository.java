package com.areteans.HotelManagementSystem.repository;

import com.areteans.HotelManagementSystem.models.Booking;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BookingRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Booking create(Booking booking) {

        Map<String, Object> userMap = jdbcTemplate.queryForMap("INSERT * FROM USER_DETAILS(username, mobilenumber, gender WHERE userid =?) values(?) returning userid, username, mobilenumber, gender",
                booking.getUser().getUserId(),
                booking.getUser().getUserName(),
                booking.getUser().getMobileNumber(),
                booking.getUser().getGender());

        jdbcTemplate.update("insert into BOOKING_DETAILS (bookingid, bookingstatus, userid, username, mobilenumber, gender) values(?,?,?,?,?,?) ",
                booking.getBookingId(),
                booking.getBookingStatus(),
                userMap.get("userId"),
                userMap.get("userName"),
                userMap.get("mobileNumber"),
                userMap.get("gender"));

        return booking;
    }
    public List getData(Long userid) {
        List booking = jdbcTemplate.queryForList("select * from BOOKING_DETAILS where userid = ?", userid);
        return booking;
    }





}
