package com.example.messages.service;

import com.example.messages.model.request.NewMessageRequest;
import com.example.messages.model.entities.MessageEntity;
import com.example.messages.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessagesService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessagesService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public MessageEntity saveMessage(NewMessageRequest newMessage) {
        // todo save message logic
        return messageRepository.save(new MessageEntity(newMessage.getMessage(), newMessage.getTimeStamp()));
    }

    public List<MessageEntity> getAllMessagesSortedByTimeStamp() {
        // todo get all messages sorted by timestamp logic
        return messageRepository.findAllByOrderByIdAsc();
    }
}
