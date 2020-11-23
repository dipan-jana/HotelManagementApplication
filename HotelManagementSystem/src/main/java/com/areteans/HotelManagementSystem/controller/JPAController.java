package com.areteans.HotelManagementSystem.controller;

import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.service.JPAService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "jpa")
public class JPAController {

    private final JPAService jpaService;

    @PostMapping(path = "insertjpa" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA createUser(@RequestBody UserJPA user) {
        return jpaService.putUser(user);
    }

    @GetMapping(path = "getdata" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA getData(@RequestParam(value = "userid") long userid) {
        return this.jpaService.getUserByID(userid);
    }
    @DeleteMapping(value = "deleteuser/{userid}")
    public void deleteUser(@PathVariable("userid") long userid) {
        jpaService.deleteJPARecord(userid);
    }
}
