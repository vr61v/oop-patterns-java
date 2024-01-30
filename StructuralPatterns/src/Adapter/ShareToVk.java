package Adapter;

import java.util.Date;

public class ShareToVk implements Share{
    private final VkChatMessages _messages;

    public ShareToVk(VkChatMessages messages){
        _messages = messages;
    }
    @Override
    public void Share(Message message) {
        _messages.Add(new VkMessage(message._body, message._sender, new Date()));
    }
}
