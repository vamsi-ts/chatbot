package com.example.chatbot.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    private Long orderId;

    private Long userId;
    private String status;
    private String gender;

    private LocalDateTime createdAt;
    private LocalDateTime returnedAt;
    private LocalDateTime shippedAt;
    private LocalDateTime deliveredAt;

    private Integer numOfItem;
}
