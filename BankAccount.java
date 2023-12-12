package oops;
import java.util.*;

public class BankAccount {
    // Instance variables
    private double balance;
    private String accountNumber;

    // Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0; // Initializing balance to 0 initially
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". \nNew balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Account number: ");
    	String accountNumber = sc.nextLine();
        // Creating an instance of the BankAccount class
        BankAccount account1 = new BankAccount(accountNumber);

        // Depositing and withdrawing money
        System.out.println("Choose the Option \n1.Deposit \n2.Withdraw \n3.Exit");
        int option = sc.nextInt();
        
        switch(option) {
        
        case 1:
        	System.out.println("Enter the Amount: ");
        	double deposit = sc.nextDouble();
        	account1.deposit(deposit);
        	break;
        	
        case 2:
        	System.out.println("Enter the Amount: ");
        	double withdraw = sc.nextDouble();
        	account1.withdraw(withdraw);
        	break;
        	
        case 3:
        	System.out.println("Logging Out.... \nLogged out Succesfully!");
        	break;
        	
        default:
        	System.out.println("Incorrect Option!");
        	break;
        }
        	
    }
}
