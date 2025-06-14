import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter time in years: ");
        int time = input.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100), time);
        double interest = amount - principal;

        System.out.println("The Compound Interest is INR " + interest + " and total amount is INR " + amount);
    }
}
