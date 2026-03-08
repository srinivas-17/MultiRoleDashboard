User Management System – Spring Boot
Project Description

The User Management System is a Spring Boot web application that provides secure user registration, authentication, and role-based authorization. The system allows users to create an account, log in securely, and access specific pages based on their assigned roles such as ADMIN or USER.

The application is built using Spring Boot, Spring Security, Spring Data JPA, Thymeleaf, and MySQL. It follows a layered architecture consisting of Controller, Service, Repository, and DTO layers to ensure maintainable and scalable code.

During the signup process, the system validates user inputs, checks for duplicate email registrations, and ensures password confirmation. User passwords are securely stored in the database using BCrypt password encryption provided by Spring Security.

The project also implements DTO (Data Transfer Objects) to transfer data between layers without exposing entity classes directly. ModelMapper is used to simplify DTO to entity conversions, reducing manual mapping code.

Additionally, role-based access control is implemented so that different users can access different sections of the application. For example, admin users can access admin dashboards, while regular users can access user-specific pages.

This project demonstrates important backend development concepts such as secure authentication, authorization, layered architecture, data validation, and database integration.

Features

User Registration

Secure Login Authentication

Password Encryption using BCrypt

Role-Based Authorization (Admin/User)

Email Validation

Password Confirmation Validation

Thymeleaf UI Pages

DTO Layer for Data Transfer

Technologies Used

Java

Spring Boot

Spring Security

Spring Data JPA

Hibernate

Thymeleaf

MySQL

Maven

ModelMapper

HTML / CSS




ModelMapper for Object Mapping

MySQL Database Integration
