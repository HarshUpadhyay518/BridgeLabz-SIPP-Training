package CoreJava.Methods;

import java.util.Scanner;

public class question4 {
    ublic static int checkNumber(int n) {
        if (n > 0) return 1;
        else if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkNumber(num);
        String output = (result == 1) ? "Positive" : (result == -1) ? "Negative" : "Zero";
        System.out.println("The number is: " + output);
    }
}
