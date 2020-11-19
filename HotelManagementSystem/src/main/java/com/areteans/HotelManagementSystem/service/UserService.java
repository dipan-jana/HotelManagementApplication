package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.User;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Map<String, Object> getData(int userId) {
       return jdbcTemplate.queryForMap("select * from USER_DETAILS where userid = ?" , userId);

    }

//    public User getUserBYId (int userId) {
//
//        return userRepo.findById(userId);
 //   }
}
