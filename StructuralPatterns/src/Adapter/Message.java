package Adapter;

public class Message {
    protected final String _title;
    protected final String _body;
    protected final String _sender;
    public Message(String title, String body, String sender){
        _title = title;
        _body = body;
        _sender = sender;
    }
    public void Print(){
        System.out.println(_title);
        System.out.println(_body);
        System.out.println(_sender);
    }
}
