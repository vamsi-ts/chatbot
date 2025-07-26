package com.example.chatbot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatResponse {
    private Long conversationId;
    private String userMessage;
    private String aiResponse;
}
