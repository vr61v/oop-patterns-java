package FactoryMethod;

public class CustomLatte extends CustomCoffee{
    public CustomLatte(){
        milk = true;
        company = "People love";
        price = 240;
    }
    public CustomLatte(boolean milk){
        this();
        this.milk = milk;
    }

    @Override
    public String toString(){
        return "milk: " + milk.toString() +
                "\ncompany: " + company +
                "\nprice: " + price.toString();
    }
}
