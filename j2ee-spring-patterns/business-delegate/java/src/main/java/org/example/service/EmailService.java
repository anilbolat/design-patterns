package org.example.service;

import org.example.service.MessageService;

public class EmailService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("sending an email.");
    }
}
