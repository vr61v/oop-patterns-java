package decorator.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Service {
    protected String name;
    public Service(String name){
        this.name = name;
    }
    public abstract int getPrice();
    public String whatItIs(){
        return name;
    }
}