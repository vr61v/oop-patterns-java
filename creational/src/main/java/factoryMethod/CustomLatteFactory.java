package factoryMethod;

import factoryMethod.entities.CustomLatte;
import factoryMethod.models.CustomCoffee;

public class CustomLatteFactory implements CustomCoffeeFactory{
    @Override
    public CustomCoffee createCoffee() {
        return new CustomLatte();
    }
    @Override
    public CustomCoffee createCoffeeNoMilk(){
        return new CustomLatte(false);
    }
}
