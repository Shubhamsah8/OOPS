package oops;
import java.util.*;

public class Student {
	// Instance variables
	private String name;
	private int ID;
	private int age;
	
	// Constructor
	public Student(String name, int age, int ID) {
		this.name = name;
		this.age = age;
		this.ID = ID;
	}
	
	// Method to print Name, Age and ID
	public void printNameAndAge() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("ID: "+ID);
	}
	
	//Main Function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter the Student ID: ");
		int ID = sc.nextInt();
		Student student1 = new Student(name, age, ID);
		
		student1.printNameAndAge();
	}

}
