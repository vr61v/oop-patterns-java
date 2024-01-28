package Command;

public class StopCarCommand implements Command{
    private final Car _car;
    public StopCarCommand(Car car){ _car = car; }
    @Override
    public void Execute() { _car.Stop(); }
}
