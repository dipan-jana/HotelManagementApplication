package com.areteans.HotelManagementSystem.controller;

import com.areteans.HotelManagementSystem.models.User;
import com.areteans.HotelManagementSystem.models.UserJPA;
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

//    @PostMapping(path = "insertjpa" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public UserJPA createUser(@RequestBody UserJPA user) {
//        return userService.putUser(user);
//    }
//
//    @GetMapping(path = "getdata" , consumes = MediaType.APPLICATION_JSON_VALUE)
//    public UserJPA getData(@RequestParam(value = "userid") long userid) {
//        return this.userService.getUserByID(userid);
//    }
//    @DeleteMapping(value = "deleteuser/{userid}")
//    public void deleteUser(@PathVariable("userid") long userid) {
//        userService.deleteJPARecord(userid);
//    }






}
