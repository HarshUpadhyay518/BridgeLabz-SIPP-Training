package CoreJava.JavaFundamentals;
import java.util.Scanner;

public class squareAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of square: ");
        double side = input.nextDouble();
        double perimeter = 4 * side;
        double area = side * side;
        System.out.println("The Perimeter of square is " + perimeter + " and area is " + area);
    }
    
}
