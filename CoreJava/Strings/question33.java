package CoreJava.Strings;

import java.util.Scanner;

public class question33 {
    static String[] splitWords(String text) {
        text = text + " ";
        String word = "";
        String[] temp = new String[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                temp[index++] = word;
                word = "";
            }
        }
        String[] words = new String[index];
        System.arraycopy(temp, 0, words, 0, index);
        return words;
    }

    static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static int[] getShortestLongest(String[] words) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (getLength(words[i]) < getLength(words[minIndex])) minIndex = i;
            if (getLength(words[i]) > getLength(words[maxIndex])) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        int[] result = getShortestLongest(words);

        System.out.println("Shortest Word: " + words[result[0]]);
        System.out.println("Longest Word: " + words[result[1]]);
    }
}
