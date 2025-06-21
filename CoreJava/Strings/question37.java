package CoreJava.Strings;

import java.util.Scanner;

public class question37 {
     static String[] manualSplit(String text) {
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

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] builtIn = input.split(" ");
        String[] manual = manualSplit(input);

        System.out.println("Arrays equal? " + compareArrays(builtIn, manual));
    }
}
