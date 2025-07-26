package com.example.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.chatbot.entity.NewUser;

public interface NewUserRepository extends JpaRepository<NewUser, Long>{

}
