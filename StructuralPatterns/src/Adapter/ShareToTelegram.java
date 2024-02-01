package Adapter;

import java.util.ArrayList;

public class ShareToTelegram implements Share{
    private final TelegramChatMessages _messages;

    public ShareToTelegram(TelegramChatMessages messages){
        _messages = messages;
    }
    @Override
    public void Share(Message message) {
        _messages.Add(new TelegramMessage(message._body, message._sender, null));
    }
}
