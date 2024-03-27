package org.example.service;

import org.example.service.MessageService;

public class SMSService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("sending an SMS.");
    }
}
