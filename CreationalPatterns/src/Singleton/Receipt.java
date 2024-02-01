package Singleton;

import java.util.Date;

public class Receipt {
    private final String _coffee;
    private final Date _date;
    private final Integer _price;
    public Receipt(String coffee, Date date, Integer price){
        _coffee = coffee;
        _date = date;
        _price = price;
    }
    @Override
    public String toString(){
        return _coffee + " " + _price.toString() + "rub. " + _date.toString();
    }
}
