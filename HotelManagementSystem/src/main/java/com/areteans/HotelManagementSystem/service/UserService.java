package com.areteans.HotelManagementSystem.service;

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

    public Map<String, Object> getData(int userId) {
       return jdbcTemplate.queryForMap("select * from USER_DETAILS where userid = ?" , userId);

    }

   public Map<String, Object> updateTable(Map<String, Object> user) {

        jdbcTemplate.update("UPDATE USER_DETAILS SET username =?, mobilenumber =?, gender=? WHERE userid =?",
                user.get("userName"),
                user.get("mobileNumber"),
                user.get("gender"),
                Long.parseLong((String) user.get("userid")));
        return user;

    }

    public void deleteRecord(int userId) {
        jdbcTemplate.update("DELETE FROM USER_DETAILS WHERE userid=?", userId);
    }



}
