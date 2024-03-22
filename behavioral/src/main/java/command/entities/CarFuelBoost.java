package command.entities;

import command.Car;

public class CarFuelBoost implements Car {
    @Override
    public void start() {
        System.out.println("Start: car fuel boost is started");
    }

    @Override
    public void drive() {
        for(int fuel = 10; fuel > 0; --fuel)
            System.out.println("Drive: fuel: " + fuel);
    }

    @Override
    public void stop() {
        System.out.println("Start: car fuel boost is stopped");
    }
}
