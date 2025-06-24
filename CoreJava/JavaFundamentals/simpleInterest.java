package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();

        double interest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is INR " + interest);
    }
    
}
