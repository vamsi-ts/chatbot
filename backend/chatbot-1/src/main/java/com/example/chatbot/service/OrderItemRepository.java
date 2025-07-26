package com.example.chatbot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatbot.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
