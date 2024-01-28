package Mediator;

import java.io.IOException;

public class Word {
    private final ReadText _read;
    private final SaveText _save;
    public Word(){
        _read = new ReadText();
        _save = new SaveText();
    }
    public void Start(){
        String text = "";
        try{
            while(!text.equals("exit")){
                text = _read.read();
                _save.save(text.equals("exit") ? "" : text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
