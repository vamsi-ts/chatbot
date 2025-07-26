package com.example.chatbot.service;

import org.springframework.stereotype.Service;

import com.example.chatbot.dto.ChatRequest;
import com.example.chatbot.dto.ChatResponse;
import com.example.chatbot.entity.Conversation;
import com.example.chatbot.entity.Message;
import com.example.chatbot.entity.User;
import com.example.chatbot.repository.ConversationRepository;
import com.example.chatbot.repository.MessageRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ChatService {

    private final UserRepository userRepo;
    private final ConversationRepository conversationRepo;
    private final MessageRepository messageRepo;
    private final LLMService llmService;

    public ChatResponse handleChat(ChatRequest request) {
        User user = userRepo.findById(request.getUserId()).orElseThrow();
        Conversation conversation;

        if (request.getConversationId() != null) {
            conversation = conversationRepo.findById(request.getConversationId()).orElseThrow();
        } else {
            conversation = new Conversation();
            conversation.setUser(user);
            conversationRepo.save(conversation);
        }

        // Save user message
        Message userMessage = new Message();
        userMessage.setContent(request.getMessage());
        userMessage.setConversation(conversation);
        messageRepo.save(userMessage);

        // Use LLM to generate a response
        String aiReply = llmService.getLLMResponse(request.getMessage());

        // Save AI message
        Message aiMessage = new Message();
        aiMessage.setContent(aiReply);
        aiMessage.setConversation(conversation);
        messageRepo.save(userMessage);
        messageRepo.save(aiMessage);

        return new ChatResponse(conversation.getId(), userMessage.getContent(), aiMessage.getContent());
    }
}
