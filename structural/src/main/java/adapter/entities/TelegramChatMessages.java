package adapter.entities;

import adapter.models.TelegramMessage;
import lombok.Data;

import java.util.ArrayList;

@Data
public class TelegramChatMessages {
    private final ArrayList<TelegramMessage> messages;
    public TelegramChatMessages(){
        messages = new ArrayList<>();
    }
    public void add(TelegramMessage message){
        messages.add(message);
    }
}
