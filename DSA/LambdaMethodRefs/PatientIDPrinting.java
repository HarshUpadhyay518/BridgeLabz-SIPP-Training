import java.util.*;

public class PatientIDPrinting {
    public static void main(String[] args) {
        List<String> patientIds = Arrays.asList("P101", "P102", "P103");

        // Using method reference
        patientIds.forEach(System.out::println);
    }
}
