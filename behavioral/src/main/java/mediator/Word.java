package mediator;

import java.io.IOException;

public class Word {
    private final ReadText read;
    private final SaveText save;
    public Word(){
        read = new ReadText();
        save = new SaveText();
    }
    public void Start(){
        try{
            String text = "";
            while(!text.equals("exit")){
                text = read.read();
                save.save(text.equals("exit") ? "" : text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
