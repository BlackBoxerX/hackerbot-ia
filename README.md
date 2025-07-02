# HackerBot IA — Java + Spring + OpenAI

Chatbot inteligente, com back-end Java/Spring Boot integrado à OpenAI (ChatGPT).

![demo](demo.gif) <!-- GIF de exemplo (opcional) -->

## Como funciona

- Front-end web (HTML + JS)
- API REST Java/Spring Boot
- Integração com OpenAI GPT (qualquer modelo compatível)
- Responde perguntas direto no navegador, igual chatGPT

## Como rodar local

1. **Obtenha sua API Key da OpenAI:**  
   Crie grátis em [https://platform.openai.com/api-keys](https://platform.openai.com/api-keys)

2. **Adicione sua chave no arquivo**  
   `OpenAiService.java`:
   ```java
   private static final String API_KEY = "COLE_AQUI_SUA_CHAVE_OPENAI";
