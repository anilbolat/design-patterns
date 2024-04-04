package org.example.thirdpartylib;

import org.example.thirdpartylib.model.Message;

public class CoolMessageSenderImpl implements CoolMessageSender {
    @Override
    public void sendCoolMessage(Message message) {
        System.out.println("Sending cool message: " + message);
    }
}
