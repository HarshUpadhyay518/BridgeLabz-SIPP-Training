package CoreJava.Strings;

import java.util.Scanner;

public class question28 {
    static String manualSubstring(String str, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += str.charAt(i);
        }
        return sub;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String builtIn = input.substring(start, end);
        String manual = manualSubstring(input, start, end);

        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Equal? " + compare(manual, builtIn));
    }
}
