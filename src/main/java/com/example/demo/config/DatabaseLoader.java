package com.example.demo.config;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class DatabaseLoader {

    private UserRepository repo;

    public DatabaseLoader(UserRepository repo) {
        this.repo = repo;
    }

  @Bean
public CommandLineRunner initializeDatabase(PasswordEncoder encoder) {
    return args -> {

        User user1 = new User("david@gmail.com", encoder.encode("david123"), "david123", Role.ADMIN);
        User user2 = new User("john@yahoo.com", encoder.encode("john2020"), "john2020", Role.ADMIN);
        User user3 = new User("nam@codejava.net", encoder.encode("nam2022"), "nam2022", Role.USER);
        User user4 = new User("ravi@gmail.com", encoder.encode("ravi2121"), "ravi2121", Role.USER);

        repo.saveAll(List.of(user1, user2, user3, user4));

        System.out.println("Database initialized");
    };

    }
}

