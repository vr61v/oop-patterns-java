package chainOfResponsibility;

public class Handler2 extends Handler{
    @Override
    public void handleRequest() {
        System.out.println("I am successor of Handler1, i do something #2");
        if(this.getSuccessor() != null) this.getSuccessor().handleRequest();
    }
}
