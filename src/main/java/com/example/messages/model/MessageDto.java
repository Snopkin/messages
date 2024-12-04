package com.example.messages.model;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MessageDto {
    String message;
    LocalDateTime timeStamp;
}
