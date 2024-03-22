package abstractFactory;

import abstractFactory.models.Cappuccino;
import abstractFactory.models.Espresso;
import abstractFactory.models.Latte;

public interface CoffeeFactory {
    Latte createLatte();
    Cappuccino createCappuccino();
    Espresso createEspresso();
}
