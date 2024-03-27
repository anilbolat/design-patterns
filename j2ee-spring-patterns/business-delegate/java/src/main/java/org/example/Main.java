package org.example;

import org.example.client.MessageClient;
import org.example.model.MessageType;

public class Main {
    public static void main(String[] args) {

        MessageDelegate delegate = new MessageDelegate(MessageType.EMAIL);
        MessageClient client = new MessageClient(delegate);
        
        client.sendMessage();
        
        delegate.setType(MessageType.SMS);
        client.sendMessage();
        
        delegate.setType(MessageType.POST);
        client.sendMessage();
        
    }
}