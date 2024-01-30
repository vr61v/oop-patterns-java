package Adapter;

import java.util.Date;

public class VkMessage {
    private final String _body;
    private final String _sender;
    private final Date _date;
    public VkMessage(String body, String sender, Date date){
        _body = body;
        _sender = sender;
        _date = date;
    }
    public void Print(){
        System.out.println(_sender);
        System.out.println(_body);
        System.out.println(_date);
    }
}
