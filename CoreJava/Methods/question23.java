package CoreJava.Methods;

import java.util.Scanner;

public class question23 {
    public static double calculateBMI(double weight, double height) {
        height = height / 100; // Convert cm to meters
        return weight / (height * height);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
            status[i] = getStatus(data[i][2]);
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }
    }
}
