package TemplateMethod;

public interface ICar {
    default void Drive(){
        StartEngine();
        SpinWheels();
        Refuel();
        StopEngine();
    }
    void StartEngine();
    void SpinWheels();
    void Refuel();
    void StopEngine();
}
