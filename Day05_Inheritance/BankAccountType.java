//superclass: BankAccount
class BankAccount {
    // Keep account number and balance as private
    private int accountNumber;
    private int balance;

    //constructor of BankAccount
    BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //get method to ger Account number
    public int getAccountNo(){
        return accountNumber;
    }
    //get method to get balance
    public int getBalance(){
        return balance;
    }

    //method to display information
    void displayInfo(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Balance " + balance);
    }

}

//Subclass: Saving Account
class SavingsAccount extends BankAccount{
    double interestRate;

    //constructor of Saving Account
    SavingsAccount(int accountNumber, int balance , double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    //method to display Account type
    void displayAccountType(){
        super.displayInfo();
        System.out.println("Account Type: Saving Account");
        System.out.println(interestRate);
    }

}

//Subclass : Checking Account
class CheckingAccount extends BankAccount{

    int withdrawalLimit;
    CheckingAccount(int accountNumber, int balance , int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    //method to display Account type
    void displayAccountType(){
        super.displayInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println(withdrawalLimit);
    }
}

//Subclass Fixed  Deposit Account
class FixedDepositAccount extends BankAccount{

    double maturityPeriod;
    FixedDepositAccount(int accountNumber, int balance , double maturityPeriod){
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType(){
        super.displayInfo();
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println(maturityPeriod + " Years.");
    }
}

public class BankAccountType{
    public static void main(String[] args) {

        //Create object for different class
        SavingsAccount savingsAccount = new SavingsAccount(123456001, 5000, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount(123456002, 2000, 1000);
        FixedDepositAccount fdAccount = new FixedDepositAccount(123456003, 10000, 12);

        // Display account information and type for each account
        savingsAccount.displayAccountType();
        System.out.println();

        checkingAccount.displayAccountType();
        System.out.println();

        fdAccount.displayAccountType();
    }

}