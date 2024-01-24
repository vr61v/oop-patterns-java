package Mediator;

public class SaveText {
    private String _text;
    public SaveText(){
        _text = "";
    }
    public void save(String text){
        _text += text;
        System.out.println("I save: " + _text);
    }
}
