package org.example.adapter;

import org.example.ourcode.MessageSender;
import org.example.ourcode.model.MessageType;
import org.example.thirdpartylib.CoolMessageSender;
import org.example.thirdpartylib.model.Message;

public class MessageSenderAdapter implements MessageSender {

    private final CoolMessageSender coolMessageSender;

    public MessageSenderAdapter(CoolMessageSender coolMessageSender) {
        this.coolMessageSender = coolMessageSender;
    }

    @Override
    public void sendMessage(MessageType type, String message) {
        System.out.print("VIA ADAPTER - ");
        coolMessageSender.sendCoolMessage(new Message(message, type.name()));
    }
}
