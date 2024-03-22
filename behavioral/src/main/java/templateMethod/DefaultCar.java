package templateMethod;

public class DefaultCar implements Car {
    @Override
    public String startEngine() {
        return "Start engine in default car";
    }

    @Override
    public String spinWheels() {
        return "Spin wheels in default car...";
    }

    @Override
    public String refuel() {
        return "Refuel default car...";
    }

    @Override
    public String stopEngine() {
        return "Stop engine in default car";
    }
}
