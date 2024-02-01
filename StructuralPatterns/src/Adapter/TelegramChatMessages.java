package Adapter;

import java.util.ArrayList;

public class TelegramChatMessages {
    private final ArrayList<TelegramMessage> _messages;
    public TelegramChatMessages(){
        _messages = new ArrayList<>();
    }
    public void Add(TelegramMessage message){
        _messages.add(message);
    }
    public void PrintAll(){
        System.out.println("=========================");
        System.out.println("Telegram");
        for(var message : _messages) message.Print();
    }
}
