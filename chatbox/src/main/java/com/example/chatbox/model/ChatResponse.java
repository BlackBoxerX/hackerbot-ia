package com.example.chatbox.model;

public class ChatResponse {
    private String resposta;

    public ChatResponse() {}
    public ChatResponse(String resposta) { this.resposta = resposta; }

    public String getResposta() { return resposta; }
    public void setResposta(String resposta) { this.resposta = resposta; }
}

