package com.example.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatbot.entity.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation, Long>{

}
