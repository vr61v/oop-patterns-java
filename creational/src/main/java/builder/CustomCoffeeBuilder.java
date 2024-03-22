package builder;

public class CustomCoffeeBuilder {
    private Boolean coffee;
    private Boolean milk;
    private Boolean foam;
    private Boolean ice;
    private String company;
    private Integer price;
    public CustomCoffeeBuilder withCoffee(Boolean coffee){
        this.coffee = coffee;
        return this;
    }
    public CustomCoffeeBuilder withMilk(Boolean milk){
        this.milk = milk;
        return this;
    }
    public CustomCoffeeBuilder withFoam(Boolean foam){
        this.foam = foam;
        return this;
    }
    public CustomCoffeeBuilder withIce(Boolean ice){
        this.ice = ice;
        return this;
    }
    public CustomCoffeeBuilder withCompany(String company){
        this.company = company;
        return this;
    }
    public CustomCoffeeBuilder withPrice(Integer price){
        this.price = price;
        return this;
    }
    public CustomCoffee build(){
        return new CustomCoffee(coffee, milk, foam, ice, company, price);
    }
}
