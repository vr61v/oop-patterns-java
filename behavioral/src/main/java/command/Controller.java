package command;

public class Controller {
    private final Command start;
    private final Command drive;
    private final Command stop;
    public Controller(Command start, Command drive, Command stop){
        this.start = start;
        this.drive = drive;
        this.stop = stop;
    }
    public void start(){ start.execute(); }
    public void drive(){ drive.execute(); }
    public void stop(){ stop.execute(); }
}
