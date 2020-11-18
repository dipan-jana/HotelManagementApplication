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

//    public User userDetails(User user) {
//        return user;
//    }
    public Map<String, Object> save(Map<String, Object> user) {
        Map<String, Object> hMap = jdbcTemplate.queryForMap("insert into USER_DETAILS(userid, username, mobilenumber, gender) values(?,?,?,?)",
                Long.parseLong((String) user.get("userId")),
                user.get("userName"),
                user.get("mobileNumber"),
                user.get("gender"));

        //user.put("studentID", hMap.get("studentID"));
        return user;

    }

}
