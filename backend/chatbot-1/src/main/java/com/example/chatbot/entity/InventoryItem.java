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
public class InventoryItem {
    @Id
    private Long id;

    private Long productId;

    private LocalDateTime createdAt;
    private LocalDateTime soldAt;

    private Double cost;
    private String productCategory;
    private String productName;
    private String productBrand;
    private Double productRetailPrice;
    private String productDepartment;
    private String productSku;

    private Long productDistributionCenterId;
}

