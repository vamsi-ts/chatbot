package com.example.chatbot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatbot.entity.InventoryItem;

public interface InventoryItemRepository extends JpaRepository<InventoryItem, Long>{

}
