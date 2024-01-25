package Command;

public class StartCarCommand implements Command{
    private final Car _car;
    public StartCarCommand(Car car){ _car = car; }
    @Override
    public void Execute() { _car.Start(); }
}
