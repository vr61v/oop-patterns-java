package abstractFactory.models;

public abstract class Espresso extends Coffee {
    public Espresso(){
        this.settings = new CoffeeSettings(true, false, false);
    }
    public Espresso(String company){
        this.settings = new CoffeeSettings(true, false, false);
        this.company = company;
    }
}
