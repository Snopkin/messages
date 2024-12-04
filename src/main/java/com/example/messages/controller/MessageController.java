package com.example.messages.controller;

import com.example.messages.model.MessageDto;
import com.example.messages.model.MessageEntity;
import com.example.messages.service.MessagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessagesService messageService;

    @Autowired
    public MessageController(MessagesService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/save")
    public String saveMessage(@RequestBody MessageDto newMessage) {
        MessageEntity savedMessage =  messageService.saveMessage(newMessage);
        return String.format("Message saved! %s", savedMessage);
    }

    @GetMapping("/get")
    public List<MessageEntity> getAllMessagesSortedByTimeStamp() {
        return messageService.getAllMessagesSortedByTimeStamp();
    }

}
