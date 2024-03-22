package abstractFactory;

import abstractFactory.entities.StarsCappuccino;
import abstractFactory.entities.StarsEspresso;
import abstractFactory.entities.StarsLatte;
import abstractFactory.models.Cappuccino;
import abstractFactory.models.Espresso;
import abstractFactory.models.Latte;

public class StarsCoffeeFactory implements CoffeeFactory{
    @Override
    public Latte createLatte() {
        return new StarsLatte();
    }

    @Override
    public Cappuccino createCappuccino() {
        return new StarsCappuccino();
    }

    @Override
    public Espresso createEspresso() {
        return new StarsEspresso();
    }
}
