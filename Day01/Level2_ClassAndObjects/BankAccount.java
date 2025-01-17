import java.util.*;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private Double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: ₹" +amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: ₹" +amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Unable to withdraw ₹" + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current balance is: "+balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input student details
        System.out.println("Enter account holder's name: ");
        String name = input.nextLine();
        System.out.println("Enter account number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter initial balance: ");
        double initialBalance = input.nextDouble();

        //Create BankAccount object
        BankAccount account  = new BankAccount(name, accountNumber, initialBalance);

        // ATM Simulation Menu
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
