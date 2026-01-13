package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter deposit: ");
        double deposit = input.nextDouble();
        System.out.print("Enter withdrawal: ");
        double withdrawal = input.nextDouble();

        double finalBalance = balance + deposit - withdrawal;
        System.out.println("The final balance in account is INR " + finalBalance);
    }
}
