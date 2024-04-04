package org.example.ourcode;

import org.example.adapter.MessageSenderAdapter;
import org.example.ourcode.model.MessageType;
import org.example.thirdpartylib.CoolMessageSender;
import org.example.thirdpartylib.CoolMessageSenderImpl;
import org.example.thirdpartylib.model.Message;

public class MessageSenderImpl implements MessageSender {

    private final MessageSenderAdapter messageSenderAdapter;

    public MessageSenderImpl() {
        messageSenderAdapter = new MessageSenderAdapter(new CoolMessageSenderImpl());
    }
    
    @Override
    public void sendMessage(MessageType type, String message) {

        // System.out.println("Sending " + type + " via our sender: " + message);

        // via 3rd party lib
        // CoolMessageSender coolMessageSender = new CoolMessageSenderImpl();
        // coolMessageSender.sendCoolMessage(new Message(message, type.name()));

        // via adapter
        messageSenderAdapter.sendMessage(type, message);
    }
}
