import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = subtract(a, b); break;
            case '*': result = multiply(a, b); break;
            case '/': 
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    valid = false;
                } else {
                    result = divide(a, b);
                }
                break;
            default: 
                System.out.println("Invalid operator.");
                valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
