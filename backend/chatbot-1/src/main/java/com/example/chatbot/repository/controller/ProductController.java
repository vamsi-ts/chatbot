package com.example.chatbot.repository.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatbot.entity.Product;
import com.example.chatbot.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/top5")
    public List<Product> getTop5SoldProducts() {
        return productRepository.findTop5ByOrderBySoldQuantityDesc();
    }
}
