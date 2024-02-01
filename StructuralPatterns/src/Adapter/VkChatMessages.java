package Adapter;

import java.util.ArrayList;

public class VkChatMessages {
    private final ArrayList<VkMessage> _messages;
    public VkChatMessages(){
        _messages = new ArrayList<>();
    }
    public void Add(VkMessage message){
        _messages.add(message);
    }
    public void PrintAll(){
        System.out.println("=========================");
        System.out.println("Vk");
        for(var message : _messages) message.Print();
    }
}
