package CoreJava.Strings;

public class question18 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";

        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
                } else {
                    System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
                }
                return;
            }
        }
        if (str1.length() < str2.length())
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        else if (str1.length() > str2.length())
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
        else
            System.out.println("Strings are equal");
    }
}
