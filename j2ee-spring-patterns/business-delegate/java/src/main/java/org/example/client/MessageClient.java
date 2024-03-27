package org.example.client;

import org.example.MessageDelegate;

public class MessageClient {
    
    private final MessageDelegate messageDelegate;
    
    public MessageClient(MessageDelegate messageDelegate) {
        this.messageDelegate = messageDelegate;
    }
    
    public void sendMessage() {
        this.messageDelegate.sendMessage();
    }
    
}
