package facade;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class SecureSaveDocument {
    private MicrosoftWord word;
    private YandexDisk disk;
    private String text;
    public SecureSaveDocument(){
        word = new MicrosoftWord();
        disk = new YandexDisk();
    }
    public void input(){
        var scan = new Scanner(System.in);
        System.out.print("Input: ");
        text = scan.nextLine();
    }
    public void save(){
        word.save(text);
        disk.save(text);
        System.out.println("I save: '" + word.getText() + "' in word and YandexDisk!");
    }
    public void inputAndSave(){
        this.input();
        this.save();
    }
    public void output(){
        disk.draw();
    }
}
