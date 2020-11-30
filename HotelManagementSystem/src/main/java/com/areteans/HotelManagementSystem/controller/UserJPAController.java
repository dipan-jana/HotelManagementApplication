package com.areteans.HotelManagementSystem.controller;
import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.service.UserJPAService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "user")
public class UserJPAController {

    private final UserJPAService jpaService;

    @PostMapping(path = "insertuser" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA createUser(@RequestBody UserJPA user) {
        return jpaService.putUser(user);
    }

    @GetMapping(path = "getuserdata" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserJPA getUserData(@RequestParam(value = "userid") long userid) {
        return this.jpaService.getUserByID(userid);
    }

    @DeleteMapping(value = "deleteuser/{userid}")
    public void deleteUser(@PathVariable("userid") long userid) {
        jpaService.deleteUserJPARecord(userid);
    }
}
