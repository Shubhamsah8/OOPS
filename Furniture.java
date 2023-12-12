package oops;
import java.util.*;

public class Furniture {
    // Instance variables
    private String type;
    private String material;
    private double price;

    // Constructor
    public Furniture(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    // Method to calculate discount based on material
    public double calculateDiscount() {
    	
    	double discountedPercentage;
        if("wood".equals(material)) {
        	discountedPercentage = 0.2;
        	price = price*discountedPercentage;
        }
        else if("Steel".equals(material)) {
        	discountedPercentage = 0.3;
        	price = price*discountedPercentage;
        }
        else if("Plastic".equals(material)){
        	discountedPercentage = 0.25;
        	price = price*discountedPercentage;
        }
        return price;
    }

    // Method to print furniture information including discounted price
    public void printFurnitureInfo() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + (price - calculateDiscount()));
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Furniture name: ");
    	String type = sc.nextLine();
    	
    	System.out.println("Enter the Material: ");
    	String material = sc.nextLine();
    	
    	System.out.println("Enter the price: ");
    	double price = sc.nextDouble();
    	
        Furniture furniture1 = new Furniture(type, material, price);

        furniture1.printFurnitureInfo();
    }
}

