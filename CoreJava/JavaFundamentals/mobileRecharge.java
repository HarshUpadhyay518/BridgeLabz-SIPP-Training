package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class mobileRecharge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount to recharge: ");
        double amount = input.nextDouble();
        System.out.print("Enter tax percent: ");
        double taxPercent = input.nextDouble();

        double tax = (taxPercent / 100) * amount;
        double finalAmount = amount + tax;

        System.out.println("The final amount after tax is INR " + finalAmount);
    }
}
