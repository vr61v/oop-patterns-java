package adapter;

import adapter.entities.TelegramChatMessages;
import adapter.entities.VkChatMessages;
import adapter.models.Message;

public class Client {
    public static void Share(Message message, Share share){
        share.share(message);
    }
    public static void main(String[] args) {
        var telegramChat = new TelegramChatMessages();
        var vkChat = new VkChatMessages();
        var telegram = new ShareToTelegram(telegramChat);
        var vk = new ShareToVk(vkChat);

        for(int i = 0; i < 10; ++i){
            if(i % 2 == 0) { Share(new Message(Integer.toString(i), "message to telegram chat", "Client"), telegram); }
            else { Share(new Message(Integer.toString(i), "message to vk chat", "Client"), vk); }
        }
    }
}
