package com.example.chatbot.dto;

import lombok.Data;

@Data
public class ChatRequest {
    private Long userId;
    private Long conversationId; // Optional
    private String message;
}
