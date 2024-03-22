package adapter;

import adapter.Share;
import adapter.entities.VkChatMessages;
import adapter.models.Message;
import adapter.models.VkMessage;

import java.util.Date;

public class ShareToVk implements Share {
    private final VkChatMessages messages;

    public ShareToVk(VkChatMessages messages){
        this.messages = messages;
    }
    @Override
    public void share(Message message) {
        messages.add(new VkMessage(message.getBody(), message.getSender(), new Date()));
    }
}
