package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserJPAService {
    private final UserRepo userRepo;

    public UserJPA putUser(UserJPA user) {
        return userRepo.save(user);
    }

    public UserJPA getUserByID(Long userid) {
        Optional<UserJPA> usd = userRepo.findById(userid);
        // isPresent() returns a boolean value whether id is present or not!!
        return usd.orElse(null);
    }

    public void deleteUserJPARecord(long userid) {
        userRepo.deleteById(userid);
    }




    //******* Method For Custom Query *******

    public UserJPA getData(long userid) {
        Optional<UserJPA> optional = userRepo.getUserDetails(userid);
        return optional.get();

    }


}
