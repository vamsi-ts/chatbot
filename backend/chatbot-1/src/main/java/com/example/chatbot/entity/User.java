package com.example.chatbot.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String gender;
    private String state;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String country;
    private Double latitude;
    private Double longitude;
    private String trafficSource;

    private LocalDateTime createdAt;
}

