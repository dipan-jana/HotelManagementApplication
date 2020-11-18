package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserService {
    private final JdbcTemplate jdbcTemplate;


    public Map<String, Object> save(Map<String, Object> user) {
        jdbcTemplate.update("insert into USER_DETAILS(username, mobilenumber, gender) values(?,?,?)",
                user.get("userName"),
                user.get("mobileNumber"),
                user.get("gender"));

        return user;

    }

}
