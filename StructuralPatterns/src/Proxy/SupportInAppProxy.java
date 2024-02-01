package Proxy;

public class SupportInAppProxy implements SupportService{
    private SupportInApp _support;
    private final String[] _unsupportedTask = new String[]{"Delete account", "Give user information"};

    @Override
    public void Support(String task) {
        for(var i : _unsupportedTask) {
            if(task.contains(i)) {
                System.out.println("We cant help you...");
                return;
            }
        }
        if(_support == null){ _support = new SupportInApp(); }
        _support.Support(task);
    }
}
