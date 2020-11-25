package com.areteans.HotelManagementSystem.service;

import com.areteans.HotelManagementSystem.models.UserJPA;
import com.areteans.HotelManagementSystem.userRepo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JPAService {
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
}
