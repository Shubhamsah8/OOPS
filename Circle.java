package oops;
import java.util.*;

public class Circle {
    // Instance variable
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the radius: ");
    	double radius = sc.nextDouble();
    	
        Circle circle1 = new Circle(radius);

        // Calculating and printing the area and circumference
        System.out.println("Area of the circle: " + circle1.calculateArea());
        System.out.println("Circumference of the circle: " + circle1.calculateCircumference());
    }
}
