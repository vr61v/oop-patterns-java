package TemplateMethod;

public class ElectricCar implements ICar {
    @Override
    public void StartEngine() {
        System.out.println("Start engine in electric car");
    }

    @Override
    public void SpinWheels() {
        System.out.println("Spin wheels in electric car...");
    }

    @Override
    public void Refuel() {
        System.out.println("Refuel electric car...");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop engine in electric car");
    }
}
