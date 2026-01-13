package CoreJava.Strings;

import java.util.Scanner;

public class question42 {
    static String manualTrim(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String manual = manualTrim(input);
        String builtIn = input.trim();

        System.out.println("Manual Trim: '" + manual + "'");
        System.out.println("Built-in Trim: '" + builtIn + "'");
        System.out.println("Equal? " + manual.equals(builtIn));
    }
}
