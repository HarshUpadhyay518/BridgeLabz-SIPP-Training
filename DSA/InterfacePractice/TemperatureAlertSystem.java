import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Predicate<Double> highTempAlert = temp -> temp > 38.0;
        double currentTemp = 39.5;
        if (highTempAlert.test(currentTemp)) {
            System.out.println("ALERT: High Temperature " + currentTemp);
        } else {
            System.out.println("Temperature Normal: " + currentTemp);
        }
    }
}
