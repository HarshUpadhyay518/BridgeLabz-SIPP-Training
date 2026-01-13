package CoreJava.BuiltInFunction;

import java.util.Scanner;

public class question9 {
    public static boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        System.out.println("Is palindrome: " + isPalindrome(input));
        sc.close();
    }
}
