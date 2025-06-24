package CoreJava.Strings;

public class question32 {
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to crash
        handleException();
    }
}
