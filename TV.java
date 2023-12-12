package oops;
import java.util.*;

public class TV {
    // Instance variables
    private String brand;
    private int size; // in inches
    private double price;

    // Constructor
    public TV(String brand, int size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    // Method to calculate discount based on size
    public double calculateDiscount() {

    	double discountedPrice = 0.0;
        if(size<=20) {
        	discountedPrice = 0.05;
        }
        else if(size>20 && size<=64) {
        	discountedPrice = 0.1;
        }
        else if(size>64 && size<=128) {
        	discountedPrice = 0.15;
        }
        else {
        	discountedPrice = 0.17;
        }
        return price*discountedPrice;
    }

    // Method to print TV information including discounted price
    public void printTVInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size + " inches");
        System.out.println("Origianl Price: $" + price);
        System.out.println("Discounted Price: $" + (price - calculateDiscount()));
    }

    public static void main(String[] args) {
        // Creating an instance of the TV class
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the TV brand: ");
    	String brand = sc.nextLine();
    	
    	System.out.println("Enter the TV size (in inches): ");
    	int size = sc.nextInt();
    	
    	System.out.println("Enter the TV price: ");
    	double price = sc.nextDouble();
    	
        TV tv1 = new TV(brand, size, price);

        tv1.printTVInfo();
    }
}

