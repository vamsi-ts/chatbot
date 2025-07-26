package com.example.chatbot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistributionCenter {
    @Id
    private Long id;
    private String name;
    private Double latitude;
    private Double longitude;
}
