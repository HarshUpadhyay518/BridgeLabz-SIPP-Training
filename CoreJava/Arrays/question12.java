package CoreJava.Arrays;

import java.util.Scanner;

public class question12 {
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

        System.out.print("You entered: ");
        for (int i = 0; i < count; i++) {
            System.out.print(chars[i]);
        }
    }
}
