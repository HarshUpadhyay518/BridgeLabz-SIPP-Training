package CoreJava.Strings;

public class question22 {
    public static void main(String[] args) {
        String sentence = "Java is fun. Java is powerful.";
        String target = "Java";
        String replacement = "Python";

        String result = "";
        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.equals(target))
                result += replacement + " ";
            else
                result += word + " ";
        }
        System.out.println("Modified Sentence: " + result.trim());
    }
}
