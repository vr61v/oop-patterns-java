package adapter.models;

import lombok.Data;

import java.util.Date;

@Data
public class VkMessage {
    private final String body;
    private final String sender;
    private final Date date;
    public VkMessage(String body, String sender, Date date) {
        this.body = body;
        this.sender = sender;
        this.date = date;
    }
}
