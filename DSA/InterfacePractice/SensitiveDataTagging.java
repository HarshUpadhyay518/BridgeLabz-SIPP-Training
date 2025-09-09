interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "secret";
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        UserCredentials creds = new UserCredentials();
        if (creds instanceof SensitiveData) {
            System.out.println("This class contains sensitive data and needs encryption.");
        }
    }
}
