package CoreJava.Methods;

import java.util.Scanner;

public class question2 {
    public static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate: ");
        double r = sc.nextDouble();
        System.out.print("Time: ");
        double t = sc.nextDouble();

        double si = calculateSI(p, r, t);
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate %.2f and Time %.2f\n", si, p, r, t);
    }
}
