package ClassesAndObjects;

public class ATM {
    String accountHolder;
    String accountNumber;
    double balance;

    public ATM(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if(amount <= 0){
            System.out.println("Invalid withdrawal amount.");
        }
        else if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
        else{
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance(){
        System.out.println("Account Holder:" + accountHolder);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        ATM account = new ATM("Harsh Upadhyay","ACC123456", 100000);
        account.displayBalance();
        account.deposit(5000);
        account.withdraw(2000);
        account.displayBalance();
    }
}
