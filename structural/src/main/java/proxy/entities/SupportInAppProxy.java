package proxy.entities;

import proxy.SupportService;

public class SupportInAppProxy implements SupportService {
    private SupportInApp support;
    private final String[] unsupportedTask = new String[]{"Delete account", "Give user information"};

    @Override
    public void support(String task) {
        for(var i : unsupportedTask) {
            if(task.contains(i)) {
                System.out.println("We cant help you...");
                return;
            }
        }
        if(support == null){ support = new SupportInApp(); }
        support.support(task);
    }
}
