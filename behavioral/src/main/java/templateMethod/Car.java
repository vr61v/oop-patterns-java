package templateMethod;

public interface Car {
    default String drive(){
        return startEngine() + "\n" + spinWheels() + "\n" + refuel() + "\n" + stopEngine();
    }
    String startEngine();
    String spinWheels();
    String refuel();
    String stopEngine();
}
