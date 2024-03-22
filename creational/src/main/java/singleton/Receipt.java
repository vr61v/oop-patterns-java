package singleton;

import lombok.Data;

import java.util.Date;

@Data
public class Receipt {
    private String coffee;
    private Date date;
    private Integer price;
    public Receipt(String coffee, Date date, Integer price){
        this.coffee = coffee;
        this.date = date;
        this.price = price;
    }
}
