package proxy;

import proxy.entities.SupportInAppProxy;

public class Client {
    public static void main(String[] args) {
        var service = new SupportInAppProxy();
        service.support("I need help please!");
        service.support("Delete account");
        service.support("Where is my money?!");
    }
}
