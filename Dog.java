package oops;
import java.util.*;

public class Dog {
    // Instance variables
    private String breed;
    private int age;
    private double weight;

    // Constructor
    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    // Method to calculate dog's age in human years
    public int calculateAgeInHumanYears(int ageInMonths, String breed) {
    	
    	int humanYears = 0;
        
        if(ageInMonths<=24) {
        	switch(breed) {
        	
        	case "German Shepherd" :
        	case "Bull Dog" :
        		humanYears = (int) ageInMonths;
        		break;
        		
        	default:
        		printNotBreedInfo();
        		break;
        	}
        	
        }
        else if(ageInMonths>24 && ageInMonths <72) {
        	switch(breed) {
        	
        	case "German Shepherd" :
        		humanYears =  (int) ( ageInMonths/1.2);
        		break;
        		
        	case "Bull Dog":
        		humanYears = (int) (ageInMonths/1.3);
        		break;
        		
        	default:
        		printNotBreedInfo();
        		break;
        	}
        }
        else {
        	switch(breed) {
        	
        	case "German Shepherd":
        		humanYears = (int) (ageInMonths/2.3);
        		break;
        		
        	case "Bull Dog":
        		humanYears = (int) (ageInMonths/2.4);
        		break;
        		
        	default:
        		printNotBreedInfo();
        		break;
        	}
        }
        
        return humanYears;
    }
    
    //Method to print for dog breeds that the information we do not have
    
    public void printNotBreedInfo() {
    	System.out.println("Right now we do not have information regarding this breed of dog. Sorry!");
    }

    // Method to print dog's information
    public void printDogInfo(String breed, int dogAge, double dogWeight) {
        System.out.println("Breed: " + breed);
        System.out.println("Age: " + age + " years (in human years: " + calculateAgeInHumanYears(dogAge, breed) + " years)");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        // Creating an instance of the Dog class
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your Dog Breed: ");
    	String breed = sc.nextLine();
    	
    	System.out.println("Enter your Dog Age (in months): ");
    	int dogAge = sc.nextInt();
    	
    	System.out.println("Enter your Dog Weight: ");
    	double dogWeight = sc.nextDouble();
        Dog dog1 = new Dog(breed, dogAge, dogWeight);

        dog1.printDogInfo(breed, dogAge, dogWeight);
    }
}
