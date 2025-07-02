package com.example.chatbox.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;
import java.util.*;

@Service
public class OpenAiService {
    private static final String OPENAI_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_KEY = "SUA_CHAVE_OPENAI_AQUI"; // Troque pela sua chave da OpenAI

    public String perguntar(String prompt) {
        RestTemplate restTemplate = new RestTemplate();

        Map<String, Object> body = new HashMap<>();
        body.put("model", "gpt-3.5-turbo");
        List<Map<String, String>> messages = new ArrayList<>();
        messages.add(Map.of("role", "user", "content", prompt));
        body.put("messages", messages);
        body.put("max_tokens", 300);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(API_KEY);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(body, headers);

        try {
            ResponseEntity<Map> response = restTemplate.postForEntity(OPENAI_URL, request, Map.class);
            List<Map<String, Object>> choices = (List<Map<String, Object>>) response.getBody().get("choices");
            Map<String, Object> message = (Map<String, Object>) choices.get(0).get("message");
            return (String) message.get("content");
        } catch (Exception e) {
            return "Erro ao conectar na OpenAI: " + e.getMessage();
        }
    }
}

