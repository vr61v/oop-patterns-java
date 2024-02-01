package Facade;

import java.util.Scanner;

public class SecureSaveDocument {
    private MicrosoftWord _word;
    private YandexDisk _disk;
    private String text;
    public SecureSaveDocument(){
        _word = new MicrosoftWord();
        _disk = new YandexDisk();
    }
    public void Input(){
        var scan = new Scanner(System.in);
        System.out.print("Input: ");
        text = scan.nextLine();
    }
    public void Save(){
        _word.Save(text);
        _disk.Save(text);
        System.out.println("I save: '" + _word.GetText() + "' in word and YandexDisk!");
    }
    public void InputAndSave(){
        this.Input();
        this.Save();
    }
    public void Output(){
        _disk.Draw();
    }
}
