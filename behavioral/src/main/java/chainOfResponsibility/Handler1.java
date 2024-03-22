package chainOfResponsibility;

public class Handler1 extends Handler {
    @Override
    public void handleRequest() {
        System.out.println("I am first, i do something #1");
        if(this.getSuccessor() != null) this.getSuccessor().handleRequest();
    }
}
