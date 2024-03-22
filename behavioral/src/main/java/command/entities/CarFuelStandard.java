package command.entities;

import command.Car;

public class CarFuelStandard implements Car {
    @Override
    public void start() {
        System.out.println("Start: car fuel standard is started");
    }

    @Override
    public void drive() {
        for(int fuel = 5; fuel > 0; --fuel)
            System.out.println("Drive: fuel: " + fuel);
    }

    @Override
    public void stop() {
        System.out.println("Start: car fuel standard is stopped");
    }
}
