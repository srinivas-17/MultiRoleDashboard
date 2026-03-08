package com.example.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Transient
    private String confirmPassword; // not stored in database

    @Enumerated(EnumType.STRING)
    private Role role;

    public User() {
    }
    public User(String email, String password,String confirmPassword, Role role) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.role = role;
    }
}