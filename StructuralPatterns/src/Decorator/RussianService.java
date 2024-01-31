package Decorator;

public class RussianService extends Service{
    public RussianService() {
        super("Russian service");
    }

    @Override
    public int GetPrice() {
        return 99;
    }
}
