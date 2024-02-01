package Facade;

public class MicrosoftWord {
    private String _text = "";
    public String GetText(){ return _text; }

    public void Save(String text){
        _text = text;
    }
    public void Draw(){
        System.out.println(_text);
    }
}
