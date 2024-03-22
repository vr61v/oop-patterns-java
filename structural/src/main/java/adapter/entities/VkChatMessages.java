package adapter.entities;

import adapter.models.VkMessage;
import lombok.Data;

import java.util.ArrayList;

@Data
public class VkChatMessages {
    private final ArrayList<VkMessage> messages;
    public VkChatMessages(){
        messages = new ArrayList<>();
    }
    public void add(VkMessage message){
        messages.add(message);
    }
}
