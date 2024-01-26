package AbstractFactory;

public interface CoffeeFactory {
    Latte CreateLatte();
    Cappuccino CreateCappuccino();
    Espresso CreateEspresso();
}
