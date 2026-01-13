package CoreJava.Strings;

import java.util.Scanner;

public class question39 {
    static String[] splitWords(String text) {
        String[] temp = new String[text.length()];
        String word = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ')
                word += ch;
            else if (!word.isEmpty()) {
                temp[index++] = word;
                word = "";
            }
        }
        if (!word.isEmpty()) temp[index++] = word;

        String[] result = new String[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    static int getLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (Exception e) {}
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        System.out.println("Word\tLength");
        for (String word : words) {
            System.out.println(word + "\t" + getLength(word));
        }
    }
}
