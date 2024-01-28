package Builder;

public class CustomCoffeeBuilder {
    private final CustomCoffee _coffee;
    public CustomCoffeeBuilder(){
        _coffee = new CustomCoffee();
    }
    public CustomCoffeeBuilder WithCoffee(Boolean coffee){
        _coffee.coffee = coffee;
        return this;
    }
    public CustomCoffeeBuilder WithMilk(Boolean milk){
        _coffee.milk = milk;
        return this;
    }
    public CustomCoffeeBuilder WithFoam(Boolean foam){
        _coffee.foam = foam;
        return this;
    }
    public CustomCoffeeBuilder WithIce(Boolean ice){
        _coffee.ice = ice;
        return this;
    }
    public CustomCoffeeBuilder WithCompany(String company){
        _coffee.company = company;
        return this;
    }
    public CustomCoffeeBuilder WithPrice(Integer price){
        _coffee.price = price;
        return this;
    }
    public CustomCoffee Build(){
        return _coffee;
    }
}
