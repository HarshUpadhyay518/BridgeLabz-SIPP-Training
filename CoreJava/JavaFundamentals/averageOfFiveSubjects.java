package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class averageOfFiveSubjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 subject marks: ");
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += input.nextDouble();
        }
        double average = sum / 5;
        System.out.println("The Average mark of 5 subjects is " + average);
    }
}
