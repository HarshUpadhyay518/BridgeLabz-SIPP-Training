package CoreJava.Strings;

public class question20 {
    public static void main(String[] args) {
        String str = "Hello World";
        char remove = 'l';
        String result = "";

        for (char c : str.toCharArray()) {
            if (c != remove)
                result += c;
        }
        System.out.println("Modified String: " + result);
    }
}
