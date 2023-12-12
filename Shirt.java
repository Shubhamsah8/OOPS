package oops;
import java.util.*;

public class Shirt {
    // Instance variables
    private String size;
    private String color;
    private double price;

    // Constructor
    public Shirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    // Method to calculate discount based on size
    public double calculateDiscount() {

        double discountedPercentage;
        
        if(size == "L") {
        	discountedPercentage  = 0.1;
        }
        else if(size == "M") {
        	discountedPercentage = 0.15;
        }
        else if(size == "L") {
        	discountedPercentage = 0.2;
        }
        else {
        	discountedPercentage = 0.25;
        }
        return price*discountedPercentage;
    }
    
    //Method to calculate discount based of all three variables
    
    public double calculateDiscountUsingAll() {
    	
    	double discountedPercentage = 0;
    	
    	switch (size) {
        case "L":
            switch (color) {
                case "red":
                    if (price <= 200) {
                        discountedPercentage += 0.06;
                    } else if (price > 200 && price <= 500) {
                        discountedPercentage += 0.15;
                    } else {
                        discountedPercentage += 0.2;
                    }
                    break;

                case "blue":
                    if (price <= 200) {
                        discountedPercentage += 0.07;
                    } else if (price > 200 && price <= 500) {
                        discountedPercentage += 0.17;
                    } else {
                        discountedPercentage += 0.21;
                    }
                    break;

                case "black":
                    if (price <= 200) {
                        discountedPercentage += 0.08;
                    } else if (price > 200 && price <= 500) {
                        discountedPercentage += 0.19;
                    } else {
                        discountedPercentage += 0.27;
                    }
                    break;

                default:
                    printDefaultMessage();
            }
            break;

        case "M":
        	switch (color) {
            case "red":
                if (price <= 200) {
                    discountedPercentage += 0.07;
                } else if (price > 200 && price <= 500) {
                    discountedPercentage += 0.18;
                } else {
                    discountedPercentage += 0.21;
                }
                break;

            case "blue":
                if (price <= 200) {
                    discountedPercentage += 0.06;
                } else if (price > 200 && price <= 500) {
                    discountedPercentage += 0.15;
                } else {
                    discountedPercentage += 0.22;
                }
                break;

            case "black":
                if (price <= 200) {
                    discountedPercentage += 0.09;
                } else if (price > 200 && price <= 500) {
                    discountedPercentage += 0.18;
                } else {
                    discountedPercentage += 0.28;
                }
                break;

            default:
                printDefaultMessage();
        }
            break;

        case "S":
        	switch (color) {
            case "red":
                if (price <= 200) {
                    discountedPercentage += 0.05;
                } else if (price > 200 && price <= 500) {
                    discountedPercentage += 0.17;
                } else {
                    discountedPercentage += 0.25;
                }
                break;

            case "blue":
                if (price <= 200) {
                    discountedPercentage += 0.08;
                } else if (price > 200 && price <= 500) {
                    discountedPercentage += 0.16;
                } else {
                    discountedPercentage += 0.23;
                }
                break;

            case "black":
                if (price <= 200) {
                    discountedPercentage += 0.09;
                } else if (price > 200 && price <= 500) {
                    discountedPercentage += 0.17;
                } else {
                    discountedPercentage += 0.29;
                }
                break;

            default:
                printDefaultMessage();
        }
            break;
            
    }
    	return price*discountedPercentage;
    }
    
    //Method to print the Default message
    
    public void printDefaultMessage() {
    	System.out.print("There is no discount on this shirt.");
    }

    // Method to print shirt information including discounted price
    public void printShirtInfo() {
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Discounted Price: $" + (price - calculateDiscount()));
        System.out.println("Discounted Price (based on all variables): $"+(price - calculateDiscountUsingAll()));
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the shirt's size: ");
    	String size = sc.nextLine();
    	
    	System.out.println("Enter the shirt's color: ");
    	String color = sc.nextLine();
    	
    	System.out.println("Enter the shirt's price");
    	double price = sc.nextDouble();
        
        Shirt shirt1 = new Shirt(size, color, price);

        
        shirt1.printShirtInfo();
    }
}

