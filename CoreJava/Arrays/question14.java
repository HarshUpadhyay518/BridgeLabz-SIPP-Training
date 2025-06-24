package CoreJava.Arrays;

import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = new char[100];
        int count = 0;

        System.out.println("Enter characters (end with '.'):");

        while (true) {
            char ch = sc.next().charAt(0);
            if (ch == '.') break;
            input[count++] = ch;
        }

        System.out.print("Modified: ");
        for (int i = 0; i < count; i++) {
            if ("aeiouAEIOU".indexOf(input[i]) >= 0) {
                System.out.print("$" + input[i] + "$");
            } else {
                System.out.print(input[i]);
            }
        }
    }
}
