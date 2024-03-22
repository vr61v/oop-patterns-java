package facade;

public class Client {
    public static void main(String[] args) {
        var saver = new SecureSaveDocument();
        saver.inputAndSave();
        saver.inputAndSave();
        saver.inputAndSave();
        saver.output();
    }
}
