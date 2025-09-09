import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Patient needs urgent attention"),
            new Alert("Normal", "Routine checkup reminder"),
            new Alert("Warning", "Low oxygen level detected")
        );

        // Predicate to filter only critical alerts
        Predicate<Alert> criticalFilter = alert -> alert.type.equals("Critical");

        System.out.println("Critical Alerts:");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);
    }
}
