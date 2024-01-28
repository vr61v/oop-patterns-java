package ChainOfResponsibility;

public class Handler3 extends Handler{
    @Override
    public void HandleRequest() {
        System.out.println("I am successor of Handler2, i do something #3");
        if(this.GetSuccessor() != null) this.GetSuccessor().HandleRequest();
    }
}
