package com.gentech.demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatMessageController {

    private ChatClient chatClient;

    public ChatMessageController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/chatmsg")
    public String chat(@RequestParam("message") String message)
    {
        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}
