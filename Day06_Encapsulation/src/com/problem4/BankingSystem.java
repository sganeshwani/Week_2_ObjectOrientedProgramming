package com.problem4;

// Abstract class representing a generic Bank Account
abstract class BankAccount {
    private String accountNumber; // Unique account number
    private String holderName;    // Name of the account holder
    private double balance;       // Current balance in the account

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters for private fields
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount; // Increase balance by amount
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount; // Deduct amount from balance
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract method to calculate interest (to be implemented by subclasses)
    abstract double calculateInterest();

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Interface representing loan-related functionality
interface Loanable {
    boolean applyForLoan(double amount); // Method to apply for a loan
    double calculateLoanEligibility();  // Method to calculate loan eligibility
}

// Subclass for Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // Interest rate for savings account

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance); // Call parent class constructor
        this.interestRate = interestRate;
    }

    // Implementation of calculateInterest for SavingsAccount
    @Override
    double calculateInterest() {
        return getBalance() * interestRate / 100; // Interest = balance * rate
    }

    // Implementation of applyForLoan for SavingsAccount
    @Override
    public boolean applyForLoan(double amount) {
        return getBalance() >= amount / 2; // Loan eligibility: 50% of balance
    }

    // Implementation of calculateLoanEligibility for SavingsAccount
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Eligibility: 2x balance
    }
}

// Subclass for Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance); // Call parent class constructor
    }

    // Implementation of calculateInterest for CurrentAccount
    @Override
    double calculateInterest() {
        return 0; // No interest for current accounts
    }

    // Implementation of applyForLoan for CurrentAccount
    @Override
    public boolean applyForLoan(double amount) {
        return getBalance() >= amount / 3; // Loan eligibility: 33% of balance
    }

    // Implementation of calculateLoanEligibility for CurrentAccount
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 1.5; // Eligibility: 1.5x balance
    }
}

// Main class to demonstrate the Banking System
public class BankingSystem {
    public static void main(String[] args) {
        // Create objects for different account types
        BankAccount savings = new SavingsAccount("S01", "Sahil", 10000, 5);
        BankAccount current = new CurrentAccount("R01", "Rahul", 10000);

        // Store all accounts in an array
        BankAccount[] accounts = {savings, current};

        // Iterate over the array and display details and interest for each account
        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("Interest: " + account.calculateInterest());
            if (account instanceof Loanable loanable) {
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}

