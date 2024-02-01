package Proxy;

public class Client {
    public static void main(String[] args) {
        var service = new SupportInAppProxy();
        service.Support("I need help please!");
        service.Support("Delete account");
        service.Support("Where is my money?!");
    }
}
