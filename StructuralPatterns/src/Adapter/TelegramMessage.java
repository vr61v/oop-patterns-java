package Adapter;

public class TelegramMessage {
    private final String _body;
    private final String _sender;
    private final String _img;
    public TelegramMessage(String body, String sender, String img){
        _body = body;
        _sender = sender;
        _img = img;
    }
    public void Print(){
        System.out.println(_sender);
        System.out.println(_body);
        System.out.println(_img);
    }
}
