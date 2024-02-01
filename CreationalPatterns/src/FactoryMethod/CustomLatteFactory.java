package FactoryMethod;

public class CustomLatteFactory implements CustomCoffeeFactory{
    @Override
    public CustomCoffee CreateCoffee() {
        return new CustomLatte();
    }
    @Override
    public CustomCoffee CreateCoffeeNoMilk(){
        return new CustomLatte(false);
    }
}
