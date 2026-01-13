package CoreJava.Strings;

public class question4 {
      // Method that generates NullPointerException (without try-catch)
    public static void generateException() {
        System.out.println("\nGenerating NullPointerException (without try-catch):");
        String text = null; // Text is not initialized
        // This line will throw NullPointerException
        int length = text.length(); // Trying to call a method on null
        System.out.println("Length of text: " + length);
    }

    // Method that handles NullPointerException using try-catch
    public static void handleException() {
        System.out.println("\nHandling NullPointerException (with try-catch):");
        String text = null; // Text is null
        try {
            int length = text.length(); // This will throw NullPointerException
            System.out.println("Length of text: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // First, try generating the exception
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception caught in main (optional): " + e.getMessage());
        }

        // Now call the method that handles the exception
        handleException();
    }
}
