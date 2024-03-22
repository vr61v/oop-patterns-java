package factoryMethod.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public abstract class CustomCoffee {
    protected Boolean milk;
    protected String company;
    protected Integer price;
    public CustomCoffee(Boolean milk, String company, Integer price){
        this.milk = milk;
        this.company = company;
        this.price = price;
    }
}
