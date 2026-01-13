package CoreJava.BuiltInFunction;

import java.util.Scanner;

public class question12 {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. F to C\n2. C to F\nChoose: ");
        int choice = sc.nextInt();
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (choice == 1)
            System.out.println("Celsius: " + toCelsius(temp));
        else
            System.out.println("Fahrenheit: " + toFahrenheit(temp));

        sc.close();
    }
}
