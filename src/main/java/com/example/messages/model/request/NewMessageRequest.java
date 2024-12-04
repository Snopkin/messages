package com.example.messages.model.request;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewMessageRequest {
    String message;
    LocalDateTime timeStamp;
}
