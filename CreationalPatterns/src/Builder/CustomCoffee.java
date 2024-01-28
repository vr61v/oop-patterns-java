package Builder;

public class CustomCoffee {
    protected Boolean coffee;
    protected Boolean milk;
    protected Boolean foam;
    protected Boolean ice;
    protected String company;
    protected Integer price;
    @Override
    public String toString(){
        return "coffee: " + coffee.toString() +
                "\nmilk: " + milk.toString() +
                "\nfoam: " + foam.toString() +
                "\nice: " + ice.toString() +
                "\ncompany: " + company +
                "\nprice: " + price.toString();
    }
}
