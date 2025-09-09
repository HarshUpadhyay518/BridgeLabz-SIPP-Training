package foreachapi;

import java.util.*;

public class EmailNotifications {
    static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }

    public static void main(String[] args) {
        List<String> emails = Arrays.asList("user1@example.com", "user2@example.com", "user3@example.com");
        emails.forEach(email -> sendEmailNotification(email));
    }
}