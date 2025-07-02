package com.example.chatbox.controller;


import com.example.chatbox.model.ChatRequest;
import com.example.chatbox.model.ChatResponse;
import com.example.chatbox.service.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@CrossOrigin(origins = "*")
public class ChatbotController {

    @Autowired
    private OpenAiService openAiService;

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {
        String resposta = openAiService.perguntar(request.getPrompt());
        return new ChatResponse(resposta);
    }
}
