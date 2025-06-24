package CoreJava.Strings;

import java.util.Scanner;

public class question34 {
    static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch += 32; // To lowercase
        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVowelsConsonants(String text) {
        int[] counts = new int[2]; // 0 - vowels, 1 - consonants
        for (int i = 0; i < text.length(); i++) {
            String type = charType(text.charAt(i));
            if (type.equals("Vowel")) counts[0]++;
            else if (type.equals("Consonant")) counts[1]++;
        }
        return counts;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = countVowelsConsonants(input);
        System.out.println("Vowels: " + count[0]);
        System.out.println("Consonants: " + count[1]);
    }
}
