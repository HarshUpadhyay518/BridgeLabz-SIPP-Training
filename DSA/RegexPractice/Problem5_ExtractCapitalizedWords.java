import java.util.regex.*;

public class Problem5_ExtractCapitalizedWords {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        Matcher m = Pattern.compile(regex).matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
