package Command;

public class Controller {
    private final Command _start;
    private final Command _drive;
    private final Command _stop;
    public Controller(Command start, Command drive, Command stop){
        _start = start;
        _drive = drive;
        _stop = stop;
    }
    public void Start(){ _start.Execute(); }
    public void Drive(){ _drive.Execute(); }
    public void Stop(){ _stop.Execute(); }
}
