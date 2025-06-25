package ConstructorsInstancesAndClassVariablesAccessModifiers;

public class BankAccount {
    public String accountNumber;     // Public - accessible anywhere
    protected String accountHolder;  // Protected - accessible in subclasses
    private double balance;          // Private - encapsulated

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative!");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : ₹" + balance);
        System.out.println("------------------------------");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("Savings Account Info:");
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("------------------------------");
    }
}

// Main class to test
public class BankAccountManagement {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount b1 = new BankAccount("1234567890", "Ankit Singh", 10000.0);
        b1.displayAccountDetails();

        // Update balance
        b1.setBalance(12000.0);
        System.out.println("Updated Balance: ₹" + b1.getBalance());
        System.out.println();

        // Create SavingsAccount object
        SavingsAccount s1 = new SavingsAccount("9876543210", "Priya Verma", 25000.0, 3.5);
        s1.displayAccountDetails();    // inherited
        s1.displaySavingsDetails();    // subclass method
    }
}
