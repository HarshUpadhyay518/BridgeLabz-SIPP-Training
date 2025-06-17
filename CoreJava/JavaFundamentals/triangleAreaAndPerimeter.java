package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class triangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side a: ");
        double a = input.nextDouble();
        System.out.print("Enter side b: ");
        double b = input.nextDouble();
        System.out.print("Enter side c: ");
        double c = input.nextDouble();

        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The Perimeter of triangle is " + perimeter + " and area is " + area);
    }
}
