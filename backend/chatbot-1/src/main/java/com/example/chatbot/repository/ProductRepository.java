package com.example.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatbot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
