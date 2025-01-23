package com.ObjectModelling;

import java.util.ArrayList;
import java.util.List;

// Class representing a Customer with details such as name, account number, and account type
class Customer {
    String name; // Customer name
    long accountNumber; // Unique account number (assigned by the bank)
    String accountType; // Type of account

    // Constructor to initialize the customer's name and account type
    Customer(String name, String accountType) {
        this.name = name; // Assign the name of the customer
        this.accountType = accountType; // Assign the type of account
    }
}

// Class representing a Bank that manages customers and their accounts
class Bank {
    private static long accountNumberGenerator = 242344323; // Static variable to generate unique account numbers
    List<Customer> customerList = new ArrayList<>(); // List to store customers of the bank

    // Method to open an account for a customer
    public void openAccount(Customer customer) {
        // Assign a unique account number to the customer
        customer.accountNumber = accountNumberGenerator++;
        // Print a success message for the customer
        System.out.println("Dear " + customer.name + ", your account opened successfully.");
        // Add the customer to the list of bank customers
        customerList.add(customer);
    }

    // Method to display all the customers of the bank
    public void showCustomers() {
        // Iterate through each customer in the list and print their details
        for (Customer c : customerList) {
            System.out.println("Customer Name: " + c.name + "   " + "Account Type: " + c.accountType);
        }
    }
}

// Main class to demonstrate the Bank and Customer functionality
public class BankAndAccount {
    public static void main(String... args) {
        // Create customer objects with name and account type
        Customer customer1 = new Customer("Sunny", "Current");
        Customer customer2 = new Customer("Anuj", "Business");
        Customer customer3 = new Customer("Sahil", "Saving");

        // Create a Bank object
        Bank hdfc = new Bank();

        // Open accounts for the customers in the bank
        hdfc.openAccount(customer1);
        hdfc.openAccount(customer2);
        hdfc.openAccount(customer3);

        // Display the details of all customers in the bank
        hdfc.showCustomers();
    }
}
