package org.example.service;

import org.example.model.MessageType;

public class MessageLookupService {

    public MessageService getMessageService(MessageType messageType) {
        switch (messageType) {
            case EMAIL:
                return new EmailService();
            case SMS:
                return new SMSService();
            default:
                return new PostService();
        }
    }

}
