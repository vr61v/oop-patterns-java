package templateMethod;

public class ElectricCar implements Car {
    @Override
    public String startEngine() {
        return "Start engine in electric car";
    }

    @Override
    public String spinWheels() {
        return "Spin wheels in electric car...";
    }

    @Override
    public String refuel() {
        return "Refuel electric car...";
    }

    @Override
    public String stopEngine() {
        return "Stop engine in electric car";
    }
}
