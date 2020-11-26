package com.areteans.HotelManagementSystem.controller;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.service.UserJPAService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "jpa")
public class JPAController {

    private final UserJPAService userJpaService;


    @PostMapping(path = "insertjpa" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA createUser(@RequestBody UserJPA user) {
        return userJpaService.putUser(user);
    }

    @GetMapping(path = "getdata" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA getData(@RequestParam(value = "userid") long userid) {
        return this.userJpaService.getUserByID(userid);
    }

    @DeleteMapping(value = "deleteuser/{userid}")
    public void deleteUser(@PathVariable("userid") long userid) {
        userJpaService.deleteUserJPARecord(userid);
    }


    @GetMapping(path = "getuser" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA getUserData(@RequestParam(value = "userid") long userid) {
        return this.userJpaService.getData(userid);
    }




}
