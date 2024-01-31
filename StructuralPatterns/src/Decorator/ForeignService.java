package Decorator;

public class ForeignService extends Service{
    public ForeignService() {
        super("Foreign service");
    }

    @Override
    public int GetPrice() {
        return 199;
    }
}
