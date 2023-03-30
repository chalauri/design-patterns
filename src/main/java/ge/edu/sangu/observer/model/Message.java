package ge.edu.sangu.observer.model;

import java.time.Instant;

public class Message {

    private Instant messageDateTime;
    private String message;

    public Message(Instant messageDateTime, String message) {
        this.messageDateTime = messageDateTime;
        this.message = message;
    }

    public Instant getMessageDateTime() {
        return messageDateTime;
    }

    public void setMessageDateTime(Instant messageDateTime) {
        this.messageDateTime = messageDateTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
