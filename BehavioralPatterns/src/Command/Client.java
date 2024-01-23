package Command;

public class Client {
    public static void DriveByCar(Car car){
        Command start = new StartCarCommand(car);
        Command drive = new DriveCarCommand(car);
        Command stop = new StopCarCommand(car);
        Controller controller = new Controller(start, drive, stop);
        controller.Start(); controller.Drive(); controller.Stop();
    }
    public static void main(String[] args) {
        System.out.println("========================");
        DriveByCar(new CarFuelStandard());
        System.out.println("========================");
        DriveByCar(new CarFuelBoost());
        System.out.println("========================");
    }
}
