package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class circleAreaAndCircumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("The circumference of circle is " + circumference + " and area is " + area);
    }
}
