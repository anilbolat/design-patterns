package org.example.thirdpartylib.model;

public class Message {
    private String message;
    private String type;
    
    public Message(String message, String type) {
        this.message = message;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}