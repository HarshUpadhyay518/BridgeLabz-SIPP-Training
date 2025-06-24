package CoreJava.Arrays;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            if (index == 10) break;

            System.out.print("Enter a number: ");
            double input = sc.nextDouble();

            if (input <= 0) break;

            arr[index++] = input;
        }

        for (int i = 0; i < index; i++) {
            total += arr[i];
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSum = " + total);
    }
}
