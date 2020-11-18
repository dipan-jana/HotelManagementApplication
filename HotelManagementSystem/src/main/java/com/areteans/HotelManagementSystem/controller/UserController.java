package com.areteans.HotelManagementSystem.controller;

import com.areteans.HotelManagementSystem.models.User;
import com.areteans.HotelManagementSystem.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "user")
public class UserController {
    private final UserService userService;



    @PostMapping(path = "details" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> details(@RequestBody Map user) {
        return userService.save(user);
    }


}
