package adapter.models;

import lombok.Data;

@Data
public class Message {
    private final String title;
    private final String body;
    private final String sender;
    public Message(String title, String body, String sender){
        this.title = title;
        this.body = body;
        this.sender = sender;
    }
}
