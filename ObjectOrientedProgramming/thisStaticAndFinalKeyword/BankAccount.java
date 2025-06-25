package thisStaticAndFinalKeyword;

public class BankAccount {
    static String bankName = "National Trust Bank";
    
    // Static counter to track total number of accounts
    static int totalAccounts = 0;

    // Final variable: account number cannot be changed
    public final String accountNumber;

    // Instance variable
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++; // Increment on each new account
    }

    // Static method to show total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
        System.out.println("-----------------------------");
    }

    // Method to display account details with instanceof check
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name         : " + bankName);
            System.out.println("Account Number    : " + accountNumber);
            System.out.println("Account Holder    : " + accountHolderName);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid account object.");
        }
    }
}

// Main class to test the system
public class BankAccountSystem {
    public static void main(String[] args) {
        // Create bank account objects
        BankAccount a1 = new BankAccount("AC001", "Ravi Sharma");
        BankAccount a2 = new BankAccount("AC002", "Neha Verma");

        // Display details
        a1.displayAccountDetails();
        a2.displayAccountDetails();

        // Show total accounts
        BankAccount.getTotalAccounts();

        // instanceof check with unrelated object
        Object test = "Random String";
        if (test instanceof BankAccount) {
            ((BankAccount) test).displayAccountDetails();
        } else {
            System.out.println("test is NOT an instance of BankAccount.");
        }
    }
}
