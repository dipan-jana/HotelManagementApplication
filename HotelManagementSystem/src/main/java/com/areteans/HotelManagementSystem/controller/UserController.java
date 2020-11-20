package com.areteans.HotelManagementSystem.controller;

import com.areteans.HotelManagementSystem.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "user")
public class UserController {
    @Autowired
    private final UserService userService;


    @PostMapping(path = "details" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> details(@RequestBody Map user) {
        return userService.save(user);
    }


    @GetMapping(path = "data" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getUser(@RequestParam(value = "userId") int userId ) {

        return this.userService.getData(userId);
    }

    @PutMapping(path = "update" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateRecord(@RequestBody Map<String, Object> user) {
        userService.updateTable(user);
    }


    @DeleteMapping(value = "delete/{userId}")

    public void deleteDetail(@PathVariable("userId") int userId) {
        userService.deleteRecord(userId);
    }





}
