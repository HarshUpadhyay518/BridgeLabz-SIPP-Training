package CoreJava.Arrays;

import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[100];
        int count = 0;

        System.out.println("Enter lowercase letters (end with '.'):");

        while (true) {
            char ch = sc.next().charAt(0);
            if (ch == '.') break;
            chars[count++] = ch;
        }

        System.out.print("Uppercase: ");
        for (int i = 0; i < count; i++) {
            System.out.print(Character.toUpperCase(chars[i]));
        }
    }
}
