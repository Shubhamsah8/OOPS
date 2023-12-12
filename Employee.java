package oops;
import java.util.*;
public class Employee {
	
	// Instance Variables
	private String name;
	private int salary;
	private int ID;
	
	// Constructor
	public Employee(String name, int salary, int ID){
		this.name = name;
		this.salary = salary;
		this.ID = ID;
	}
	
	// Method to calculate Salary
	public double salaryCalculator(){
		return salary*12;  // Assuming that the salary is monthly
	}
	
	// Method to print Name and Salary
	public void printSalary() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salaryCalculator());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee monthly Salary: ");
		int salary = sc.nextInt();
		
		System.out.println("Enter the Employee ID: ");
		int ID = sc.nextInt();
		
		Employee e1 = new Employee(name, salary, ID);
		e1.printSalary();
	}

}
