package abstractFactory.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Coffee {
    protected CoffeeSettings settings;
    protected String company;
}
