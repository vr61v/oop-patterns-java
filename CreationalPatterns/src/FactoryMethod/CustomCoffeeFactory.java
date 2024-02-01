package FactoryMethod;

public abstract interface CustomCoffeeFactory {
    CustomCoffee CreateCoffee();
    CustomCoffee CreateCoffeeNoMilk();
}
