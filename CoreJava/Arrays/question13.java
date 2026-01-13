package CoreJava.Arrays;

import java.util.Scanner;

public class question13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[100];
        int count = 0;

        System.out.println("Enter characters (end with '.'):");

        while (true) {
            char ch = sc.next().charAt(0);
            if (ch == '.') break;
            chars[count++] = ch;
        }

        System.out.print("Reversed: ");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
