package mediator;

public class SaveText {
    private String text;
    public SaveText(){
        text = "";
    }
    public void save(String text){
        this.text += text;
        System.out.println("I save: " + this.text);
    }
}
