package TemplateMethod;

public class Client {
    public static void main(String[] args) {
        System.out.println("Electric car: ");
        ICar car = new ElectricCar();
        car.Drive();
        System.out.println("Default car: ");
        car = new DefaultCar();
        car.Drive();
    }
}
