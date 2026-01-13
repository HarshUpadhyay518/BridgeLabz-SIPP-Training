package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        double units = input.nextDouble();
        System.out.print("Enter cost per unit: ");
        double rate = input.nextDouble();

        double bill = units * rate;

        System.out.println("The total electricity bill is INR " + bill);
    }
}
