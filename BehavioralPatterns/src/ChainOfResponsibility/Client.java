package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        Handler1 h1 = new Handler1();
        Handler2 h2 = new Handler2();
        Handler3 h3 = new Handler3();

        h1.SetSuccessor(h2);
        h2.SetSuccessor(h3);

        h1.HandleRequest();
    }
}
