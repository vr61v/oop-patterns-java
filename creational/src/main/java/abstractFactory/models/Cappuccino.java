package abstractFactory.models;

public abstract class Cappuccino extends Coffee {
    public Cappuccino(){
        this.settings = new CoffeeSettings(true, true, true);
    }
    public Cappuccino(String company){
        this.settings = new CoffeeSettings(true, true, true);
        this.company = company;
    }
}
