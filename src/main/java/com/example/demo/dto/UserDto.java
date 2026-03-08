package com.example.demo.dto;

import com.example.demo.model.Role;
import lombok.Data;

@Data
public class UserDto {


    private String email;

    private String password;

    private String confirmPassword;
    ;
}
