package abstractFactory.models;

public record CoffeeSettings(boolean coffee, boolean milk, boolean foam) {
    public CoffeeSettings(boolean coffee, boolean milk, boolean foam){
        this.coffee = coffee;
        this.milk = milk;
        this.foam = foam;
    }
}
