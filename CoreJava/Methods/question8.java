package CoreJava.Methods;

import java.util.Scanner;

public class question8 {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        System.out.printf("Rounds required: %.2f\n", calculateRounds(a, b, c));
    }
}
