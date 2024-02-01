package Proxy;

public class SupportInApp implements SupportService{
    @Override
    public void Support(String task) {
        if (task.isEmpty()){ System.out.println("We cant help you...");}
        System.out.println("We can help you, please call +7 *** *** ** **!");
    }
}
