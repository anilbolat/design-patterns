package org.example.service;

import org.example.service.MessageService;

public class PostService implements MessageService {
    @Override
    public void sendMessage() {
        System.out.println("sending a post.");
    }
}
