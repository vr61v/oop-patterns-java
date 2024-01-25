package Command;

public class DriveCarCommand implements Command{
    private final Car _car;
    public DriveCarCommand(Car car){ _car = car; }
    @Override
    public void Execute() { _car.Drive(); }
}
