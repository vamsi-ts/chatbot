package com.example.chatbot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LLMService {

    private final String apiKey = "YOUR_GROQ_API_KEY";
    private final String endpoint = "https://api.groq.com/openai/v1/chat/completions";

    private final RestTemplate restTemplate = new RestTemplate();

    public String getLLMResponse(String userInput) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        Map<String, Object> payload = new HashMap<>();
        payload.put("model", "llama3-8b-8192"); // or "mixtral-8x7b-32768"
        payload.put("messages", List.of(
                Map.of("role", "system", "content", "You are a helpful fashion store assistant."),
                Map.of("role", "user", "content", userInput)
        ));

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(payload, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(endpoint, entity, Map.class);
        List<Map<String, Object>> choices = (List<Map<String, Object>>) response.getBody().get("choices");

        return (String) ((Map<String, Object>) choices.get(0).get("message")).get("content");
    }
}


