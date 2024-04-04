package org.example.ourcode;

import org.example.ourcode.model.MessageType;

public interface MessageSender {
    void sendMessage(MessageType type, String message);
}
