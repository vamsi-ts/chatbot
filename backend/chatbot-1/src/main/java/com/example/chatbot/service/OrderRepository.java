package com.example.chatbot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatbot.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
