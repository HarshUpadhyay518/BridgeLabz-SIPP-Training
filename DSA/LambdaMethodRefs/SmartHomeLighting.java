import java.util.HashMap;
import java.util.Map;

public class SmartHomeLighting {
    public static void main(String[] args) {
        // Functional Interface for light actions
        interface LightAction {
            void execute();
        }

        // Map to store different triggers
        Map<String, LightAction> triggers = new HashMap<>();

        // Using lambdas for different behaviors
        triggers.put("motion", () -> System.out.println("Lights ON with soft glow."));
        triggers.put("night", () -> System.out.println("Lights ON dim mode."));
        triggers.put("voice", () -> System.out.println("Lights blinking pattern activated."));

        // Simulating triggers
        triggers.get("motion").execute();
        triggers.get("night").execute();
        triggers.get("voice").execute();
    }
}
