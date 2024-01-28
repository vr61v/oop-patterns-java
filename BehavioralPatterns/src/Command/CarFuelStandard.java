package Command;

public class CarFuelStandard implements Car {

    @Override
    public void Start() {
        System.out.println("Start: car fuel standard is started");
    }

    @Override
    public void Drive() {
        for(int fuel = 5; fuel > 0; --fuel)
            System.out.println("Drive: fuel: " + fuel);
    }

    @Override
    public void Stop() {
        System.out.println("Start: car fuel standard is stopped");
    }
}
