package org.example;

import org.example.ourcode.MessageSenderImpl;
import org.example.ourcode.model.MessageType;

public class Main {
    public static void main(String[] args) {
        MessageSenderImpl messageSender = new MessageSenderImpl();
        messageSender.sendMessage(MessageType.EMAIL, "Dune is cool!");
    }
}