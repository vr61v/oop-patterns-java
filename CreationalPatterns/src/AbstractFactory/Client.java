package AbstractFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new StarsCoffeeFactory();
        Espresso espresso = factory.CreateEspresso();
        Latte latte = factory.CreateLatte();
        Cappuccino cappuccino = factory.CreateCappuccino();

        System.out.println("Espresso created by " + espresso.Company);
        System.out.println("Latte created by " + latte.Company);
        System.out.println("Cappuccino created by " + cappuccino.Company);
    }
}
