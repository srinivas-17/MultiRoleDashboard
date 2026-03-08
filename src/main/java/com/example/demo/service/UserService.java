package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String registerUser(@RequestBody UserDto userDto) {

        User user = new User();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setConfirmPassword(userDto.getConfirmPassword());


        boolean userExists=userRepository.findByEmail(userDto.getEmail()).isPresent();
        if(userExists){
            throw new RuntimeException("User with email "+userDto.getEmail()+" already exists");
        }

        if(!userDto.getPassword().equals(userDto.getConfirmPassword())){
            throw new RuntimeException("Password and confirm password do not match");
        }

        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));

        user.setRole(Role.USER);
        userRepository.save(user);
        return "success";
    }
}
