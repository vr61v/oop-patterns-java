package ChainOfResponsibility;

public class Handler1 extends Handler {
    @Override
    public void HandleRequest() {
        System.out.println("I am first, i do something #1");
        if(this.GetSuccessor() != null) this.GetSuccessor().HandleRequest();
    }
}
