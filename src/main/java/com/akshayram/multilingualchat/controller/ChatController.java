package com.akshayram.multilingualchat.controller;

import com.akshayram.multilingualchat.chat.ChatMessage;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage){
        return ;
    }
}
