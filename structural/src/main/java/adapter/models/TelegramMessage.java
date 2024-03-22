package adapter.models;

import lombok.Data;

@Data
public class TelegramMessage {
    private final String body;
    private final String sender;
    private final String img;
    public TelegramMessage(String body, String sender, String img){
        this.body = body;
        this.sender = sender;
        this.img = img;
    }
}
