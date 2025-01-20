class BankAccount {
    // Static variable to hold the bank name for all accounts
    static String bankName = "SBI Bank";

    // Static variable to keep track of the total number of accounts
    static int totalAccounts = 0;

    // Instance variables for account holder name and account number
    String accountHolderName;
    final String accountNumber;  // Final variable that cannot be changed once assigned

    // Constructor to initialize account holder name and account number
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts whenever a new account is created
    }

    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details if the object is an instance of BankAccount
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("This is not a valid BankAccount.");
        }
    }

    public static void main(String[] args) {
        // Create two BankAccount objects
        BankAccount account1 = new BankAccount("Sahil", "12345");
        BankAccount account2 = new BankAccount("Rahul", "98765");

        // Display total accounts
        BankAccount.getTotalAccounts();

        // Display account details for each account
        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
