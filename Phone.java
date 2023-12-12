package oops;

import java.util.Scanner;

public class Phone {
    // Instance variables
    private String make;
    private String model;
    private int storage; // in GB

    // Constructor
    public Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    // Method to calculate the price of the phone
    public double calculatePrice() {
        double price = 0.0;

        if (storage <= 16) {
            switch (make) {
                case "Samsung":
                    if ("Galaxy S9".equals(model)) {
                        price += 69231.59;
                    } else {
                        printModelIsNotAvailable();
                    }
                    break;

                case "Iphone":
                    if ("Iphone 10".equals(model)) {
                        price += 70000.99;
                    } else {
                        printModelIsNotAvailable();
                    }
                    break;

                default:
                    printModelIsNotAvailable();
                    break;
            }
        } else if (storage <= 64) {
        	switch (make) {
            case "Samsung":
                if ("Galaxy S9".equals(model)) {
                    price += 90000.59;
                } else {
                    printModelIsNotAvailable();
                }
                break;

            case "Iphone":
                if ("Iphone 10".equals(model)) {
                    price += 100000.99;
                } else {
                    printModelIsNotAvailable();
                }
                break;

            default:
                printModelIsNotAvailable();
                break;
        }
        }
        	else {
        	switch (make) {
            case "Samsung":
                if ("Galaxy S9".equals(model)) {
                    price += 120000.59;
                } else {
                    printModelIsNotAvailable();
                }
                break;

            case "Iphone":
                if ("Iphone 10".equals(model)) {
                    price += 150000.99;
                } else {
                    printModelIsNotAvailable();
                }
                break;

            default:
                printModelIsNotAvailable();
                break;
        }
        	}

        return price;
    }


    
    // Method to print Not available model or make is not present
    
    public void printModelIsNotAvailable() {
    	System.out.println("Making or Model is nor Available!");
    }

    // Method to print phone information
    public void printPhoneInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    public static void main(String[] args) {
        // Creating an instance of the Phone class
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the Phone Making: ");
    	String make = sc.nextLine();
    	
    	System.out.println("Enter the Phone model: ");
    	String model = sc.nextLine();
    	
    	System.out.println("Enter the Phone Storage: ");
    	int storage = sc.nextInt();
        Phone phone1 = new Phone(make, model, storage);

        phone1.printPhoneInfo();
    }
}

