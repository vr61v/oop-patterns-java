package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new StarsCoffeeFactory();
        Espresso espresso = factory.CreateEspresso();
        Latte latte = factory.CreateLatte();
        Cappuccino cappuccino = factory.CreateCappuccino();

        System.out.println("Espresso created by " + espresso.company);
        System.out.println("Latte created by " + latte.company);
        System.out.println("Cappuccino created by " + cappuccino.company);
    }
}
