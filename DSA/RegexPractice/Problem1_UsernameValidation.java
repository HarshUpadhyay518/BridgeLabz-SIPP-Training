import java.util.regex.*;

public class Problem1_UsernameValidation {
    public static void main(String[] args) {
        String[] usernames = {"user_123", "123user", "us", "valid_User12"};
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        for (String u : usernames) {
            System.out.println(u + " → " + u.matches(regex));
        }
    }
}
