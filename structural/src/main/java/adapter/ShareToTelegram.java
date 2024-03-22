package adapter;

import adapter.Share;
import adapter.entities.TelegramChatMessages;
import adapter.models.Message;
import adapter.models.TelegramMessage;

public class ShareToTelegram implements Share {
    private final TelegramChatMessages messages;

    public ShareToTelegram(TelegramChatMessages messages){
        this.messages = messages;
    }
    @Override
    public void share(Message message) {
        messages.add(new TelegramMessage(message.getBody(), message.getSender(), null));
    }
}
