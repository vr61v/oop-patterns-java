package factoryMethod;

import factoryMethod.models.CustomCoffee;

public interface CustomCoffeeFactory {
    CustomCoffee createCoffee();
    CustomCoffee createCoffeeNoMilk();
}
