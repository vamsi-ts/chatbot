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
public class Product {
    @Id
    private Long id;

    private Double cost;
    private String category;
    private String name;
    private String brand;
    private Double retailPrice;
    private String department;
    private String sku;
    private Long distributionCenterId;
}

