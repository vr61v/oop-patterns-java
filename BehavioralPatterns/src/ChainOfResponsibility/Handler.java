package ChainOfResponsibility;

public abstract class Handler {
    private Handler Successor;
    public void SetSuccessor(Handler successor){
        if(successor == null) return;
        Successor = successor;
    }
    public Handler GetSuccessor(){
        return Successor;
    }

    public abstract void HandleRequest();
}
