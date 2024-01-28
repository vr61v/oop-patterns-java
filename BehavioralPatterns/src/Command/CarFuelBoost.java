package Command;

public class CarFuelBoost implements Car{
    @Override
    public void Start() {
        System.out.println("Start: car fuel boost is started");
    }

    @Override
    public void Drive() {
        for(int fuel = 10; fuel > 0; --fuel)
            System.out.println("Drive: fuel: " + fuel);
    }

    @Override
    public void Stop() {
        System.out.println("Start: car fuel boost is stopped");
    }
}
