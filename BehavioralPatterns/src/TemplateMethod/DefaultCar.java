package TemplateMethod;

public class DefaultCar implements ICar{
    @Override
    public void StartEngine() {
        System.out.println("Start engine in default car");
    }

    @Override
    public void SpinWheels() {
        System.out.println("Spin wheels in default car...");
    }

    @Override
    public void Refuel() {
        System.out.println("Refuel default car...");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop engine in default car");
    }
}
