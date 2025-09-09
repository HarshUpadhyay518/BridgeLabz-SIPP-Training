import java.util.regex.*;
import java.util.*;

public class Problem4_ExtractEmails {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";
        String regex = "[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,6}";

        Matcher m = Pattern.compile(regex).matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
