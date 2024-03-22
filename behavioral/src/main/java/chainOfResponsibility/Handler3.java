package chainOfResponsibility;

public class Handler3 extends Handler{
    @Override
    public void handleRequest() {
        System.out.println("I am successor of Handler2, i do something #3");
        if(this.getSuccessor() != null) this.getSuccessor().handleRequest();
    }
}
