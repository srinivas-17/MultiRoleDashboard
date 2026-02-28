package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/customer")
public class AdminCustomerController {

    @GetMapping("/info")
    public String getCustomerInfo() {
        // This is a placeholder for the actual logic to retrieve customer information.
        return "Customer information retrieved successfully.";
    }
}
