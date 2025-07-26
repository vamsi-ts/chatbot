package com.example.chatbot.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender; // "user" or "ai"

    @Column(length = 1000)
    private String content;

    private LocalDateTime timestamp = LocalDateTime.now();

    @ManyToOne
    private Conversation conversation;
}
