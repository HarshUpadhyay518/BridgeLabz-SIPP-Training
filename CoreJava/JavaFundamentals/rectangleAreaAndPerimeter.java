package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class rectangleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = input.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = input.nextDouble();
        double perimeter = 2 * (length + breadth);
        double area = length * breadth;
        System.out.println("The Perimeter of rectangle is " + perimeter + " and area is " + area);
    }
}
