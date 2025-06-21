package CoreJava.Strings;

public class question15 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Longest word: " + longest);
    }
}
