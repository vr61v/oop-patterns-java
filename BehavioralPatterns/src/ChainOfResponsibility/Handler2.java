package ChainOfResponsibility;

public class Handler2 extends Handler{
    @Override
    public void HandleRequest() {
        System.out.println("I am successor of Handler1, i do something #2");
        if(this.GetSuccessor() != null) this.GetSuccessor().HandleRequest();
    }
}
