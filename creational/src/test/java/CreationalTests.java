import abstractFactory.CoffeeFactory;
import abstractFactory.StarsCoffeeFactory;
import abstractFactory.models.Cappuccino;
import abstractFactory.models.Espresso;
import abstractFactory.models.Latte;
import builder.CustomCoffee;
import builder.CustomCoffeeBuilder;
import factoryMethod.CustomLatteFactory;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CreationalTests {
    @Test
    public void testAbstractFactory(){
        CoffeeFactory factory = new StarsCoffeeFactory();
        Espresso espresso = factory.createEspresso();
        Latte latte = factory.createLatte();
        Cappuccino cappuccino = factory.createCappuccino();

        Assertions.assertEquals(espresso.getCompany() + espresso.getSettings(), "STARS COFFEECoffeeSettings[coffee=true, milk=false, foam=false]");
        Assertions.assertEquals(latte.getCompany() + latte.getSettings(), "STARS COFFEECoffeeSettings[coffee=true, milk=true, foam=false]");
        Assertions.assertEquals(cappuccino.getCompany() + cappuccino.getSettings(), "STARS COFFEECoffeeSettings[coffee=true, milk=true, foam=true]");
    }

    @Test
    public void testBuilder(){
        var expected = new CustomCoffeeBuilder()
                .withCoffee(true)
                .withMilk(true)
                .withFoam(false)
                .withIce(true)
                .withCompany("My company")
                .withPrice(249)
                .build();
        CustomCoffee actual =  new CustomCoffee(true, true, false, true, "My company", 249);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testFactoryMethod(){
        var factory = new CustomLatteFactory();
        var coffee = factory.createCoffee();
        var coffeeNoMilk = factory.createCoffeeNoMilk();

        Assertions.assertEquals(coffee, new factoryMethod.entities.CustomLatte());
        Assertions.assertEquals(coffeeNoMilk, new factoryMethod.entities.CustomLatte(false));
    }
}
