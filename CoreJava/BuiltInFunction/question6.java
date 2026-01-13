package CoreJava.BuiltInFunction;

import java.util.Scanner;

public class question6 {
    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Maximum: " + getMax(a, b, c));
        sc.close();
    }
}
