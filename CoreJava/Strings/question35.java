package CoreJava.Strings;

import java.util.Scanner;

public class question35 {
    static String classify(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32;
        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            System.out.println(ch + "\t" + classify(ch));
        }
    }
}
