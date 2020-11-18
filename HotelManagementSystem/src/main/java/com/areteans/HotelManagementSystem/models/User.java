package com.areteans.HotelManagementSystem.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class User {

    private int userId;
    private String userName;
    private String mobileNumber;
    private String gender;

}

