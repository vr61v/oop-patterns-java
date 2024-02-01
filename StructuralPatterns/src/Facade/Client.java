package Facade;

public class Client {
    public static void main(String[] args) {
        var saver = new SecureSaveDocument();
        saver.InputAndSave();
        saver.InputAndSave();
        saver.InputAndSave();
        saver.Output();
    }
}
