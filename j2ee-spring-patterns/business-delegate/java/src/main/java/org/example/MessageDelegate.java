package org.example;

import org.example.model.MessageType;
import org.example.service.MessageLookupService;
import org.example.service.MessageService;

public class MessageDelegate {

    private MessageService service;

    private MessageType type;
    private final MessageLookupService lookupService = new MessageLookupService();

    public MessageDelegate(MessageType type) {
        this.type = type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
 
    public void sendMessage() {
        this.service = lookupService.getMessageService(type);
        this.service.sendMessage();
    }

}
