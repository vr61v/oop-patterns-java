package factoryMethod.entities;

import factoryMethod.models.CustomCoffee;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class CustomLatte extends CustomCoffee {
    public CustomLatte(){
        super(true, "People love", 240);
    }
    public CustomLatte(boolean milk){
        super(milk, "People love", 240);
    }
}
