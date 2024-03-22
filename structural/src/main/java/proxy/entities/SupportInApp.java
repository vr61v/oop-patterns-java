package proxy.entities;

import proxy.SupportService;

public class SupportInApp implements SupportService {
    @Override
    public void support(String task) {
        if (task.isEmpty()){ System.out.println("We cant help you...");}
        System.out.println("We can help you, please call +7 *** *** ** **!");
    }
}
