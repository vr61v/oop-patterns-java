package facade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MicrosoftWord {
    private String text = "";

    public void save(String text){
        this.text = text;
    }

    public void draw(){
        System.out.println(text);
    }
}
