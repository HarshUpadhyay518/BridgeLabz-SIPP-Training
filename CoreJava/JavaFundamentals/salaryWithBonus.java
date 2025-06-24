package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class salaryWithBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter bonus percent: ");
        double bonusPercent = input.nextDouble();

        double bonus = (bonusPercent / 100) * salary;
        double totalSalary = salary + bonus;

        System.out.println("The Bonus amount is " + bonus + " and final salary is " + totalSalary);
    }
}
