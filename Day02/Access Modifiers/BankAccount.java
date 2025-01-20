public class BankAccount {
    // Public variable: accessible anywhere
    public int accountNumber;

    // Protected variable: accessible within the same package and subclasses
    protected String accountHolder;

    // Private variable: accessible only within the BankAccount class
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    // Additional attribute for SavingsAccount
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display Savings Account details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public variable
        System.out.println("Account Holder: " + accountHolder); // Accessing protected variable
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class
class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount instance
        BankAccount account1 = new BankAccount(12345, "Sahil", 1000.0);
        account1.displayAccountDetails();

        // Modify and access the private balance variable via methods
        account1.setBalance(1200.0);
        System.out.println("\nUpdated Balance: $" + account1.getBalance());

        // Create a SavingsAccount instance
        SavingsAccount savingsAccount = new SavingsAccount(67890, "Rahul", 2000.0, 3.5);
        System.out.println();
        savingsAccount.displaySavingsAccountDetails();
    }
}
