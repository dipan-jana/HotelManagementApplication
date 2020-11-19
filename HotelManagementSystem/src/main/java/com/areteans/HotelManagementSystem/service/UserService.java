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

    public int updateTable(String userName, int userId) {

        String sql = "UPDATE USER_DETAILS SET username =?, WHERE userid =? values(?,?)";
        int numberofRowsEffected = jdbcTemplate.update(sql, userName, userId);
        return numberofRowsEffected;
    }

}
