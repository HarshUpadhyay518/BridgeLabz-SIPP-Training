package CoreJava.controlFlow;

import java.util.Scanner;

public class question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
