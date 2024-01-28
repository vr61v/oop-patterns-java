package AbstractFactory;

public class StarsCoffeeFactory implements CoffeeFactory{
    @Override
    public Latte CreateLatte() {
        return new StarsLatte();
    }

    @Override
    public Cappuccino CreateCappuccino() {
        return new StarsCappuccino();
    }

    @Override
    public Espresso CreateEspresso() {
        return new StarsEspresso();
    }
}
