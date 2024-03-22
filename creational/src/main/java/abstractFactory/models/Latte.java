package abstractFactory.models;


public abstract class Latte extends Coffee {
    public Latte(){
        this.settings = new CoffeeSettings(true, true, false);
    }
    public Latte(String company){
        this.settings = new CoffeeSettings(true, true, false);
        this.company = company;
    }
}
