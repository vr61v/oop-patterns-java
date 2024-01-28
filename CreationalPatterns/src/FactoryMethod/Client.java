package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        CustomLatteFactory factory = new CustomLatteFactory();
        CustomCoffee[] coffees = new CustomCoffee[5];
        for(int i = 0; i < 5; ++i){
            coffees[i] = i % 2 == 0 ? factory.CreateCoffee() : factory.CreateCoffeeNoMilk();
        }
        for(int i = 0; i < 5; ++i){ System.out.println(coffees[i].toString() + '\n'); }
    }
}
