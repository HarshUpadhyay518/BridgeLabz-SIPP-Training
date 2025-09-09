import java.util.regex.*;

public class Problem7_ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        String regex = "https?://[\\w.-]+";

        Matcher m = Pattern.compile(regex).matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
