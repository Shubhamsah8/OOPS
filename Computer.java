package oops;
import java.util.*;

public class Computer {
    // Instance variables
    private String processor;
    private int RAM; // in GB
    private int storage; // in GB

    // Constructor
    public Computer(String processor, int RAM, int storage) {
        this.processor = processor;
        this.RAM = RAM;
        this.storage = storage;
    }

    // Method to calculate the price of the computer
    public double calculatePrice() {
        
    	double price = 0.0;
        if(RAM<=8) {
        	switch (processor) {
        	
        	case "i3":
        		if(storage<=500) {
        			price += 18000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 21000;
        		}
        		else {
        			price += 25000;
        		}
        		break;
        		
        	case "i5":
        		if(storage<=500) {
        			price += 21000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 25000;
        		}
        		else {
        			price += 27000;
        		}
        		break;
        		
        	case "i7":
        		if(storage<=500) {
        			price += 22000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 27000;
        		}
        		else {
        			price += 30000;
        		}
        		break;
        		
        	case "i10":
        		if(storage<=500) {
        			price += 27000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 29000;
        		}
        		else {
        			price += 32000;
        		}
        		break;
        	}
        }
        else if(RAM>8 && RAM<=64) {
        	switch (processor) {
        	
        	case "i3":
        		if(storage<=500) {
        			price += 20000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 23000;
        		}
        		else {
        			price += 27000;
        		}
        		break;
        		
        	case "i5":
        		if(storage<=500) {
        			price += 23000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 27000;
        		}
        		else {
        			price += 29000;
        		}
        		break;
        		
        	case "i7":
        		if(storage<=500) {
        			price += 24000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 29000;
        		}
        		else {
        			price += 32000;
        		}
        		break;
        		
        	case "i10":
        		if(storage<=500) {
        			price += 29000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 31000;
        		}
        		else {
        			price += 35000;
        		}
        		break;
        	}
        }
        else {
        	switch (processor) {
        	
        	case "i3":
        		if(storage<=500) {
        			price += 25000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 27000;
        		}
        		else {
        			price += 30000;
        		}
        		break;
        		
        	case "i5":
        		if(storage<=500) {
        			price += 25000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 32000;
        		}
        		else {
        			price += 36000;
        		}
        		break;
        		
        	case "i7":
        		if(storage<=500) {
        			price += 22000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 27000;
        		}
        		else {
        			price += 30000;
        		}
        		break;
        		
        	case "i10":
        		if(storage<=500) {
        			price += 35000;
        		}
        		else if(storage>500 && storage<=1000) {
        			price += 42000;
        		}
        		else {
        			price += 50000;
        		}
        		break;
        	}
        }
        return price;
    }

    // Method to print computer information
    public void printComputerInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: $" + calculatePrice());
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	Random random = new Random();
    	System.out.println("Enter the Processor: ");
    	String processor = sc.nextLine();
    	
    	System.out.print("Enter the Ram: ");
    	int ram = random.nextInt(256);
    	System.out.println(ram);
    	
    	System.out.println("Enter the Storage: ");
    	int storage = random.nextInt(2000);
        Computer computer1 = new Computer(processor, ram, storage);

        computer1.printComputerInfo();
    }
}

