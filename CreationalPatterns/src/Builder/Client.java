package Builder;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("Build your coffee");
        var builder = new CustomCoffeeBuilder();
        var scan = new Scanner(System.in);
        System.out.print("With coffee (y/n): ");
        builder.WithCoffee(scan.nextLine().equals("y"));

        System.out.print("With milk (y/n): ");
        builder.WithMilk(scan.nextLine().equals("y"));

        System.out.print("With foam (y/n): ");
        builder.WithFoam(scan.nextLine().equals("y"));

        System.out.print("With ice (y/n): ");
        builder.WithIce(scan.nextLine().equals("y"));

        System.out.print("Witch company? ");
        builder.WithCompany(scan.nextLine());

        System.out.print("How much does coffee cost (int)? ");
        try{
            builder.WithPrice(Integer.parseInt(scan.nextLine()));
        }
        catch (Exception e){
            builder.WithPrice(0);
        }

        System.out.println(builder.Build().toString());
    }
}
