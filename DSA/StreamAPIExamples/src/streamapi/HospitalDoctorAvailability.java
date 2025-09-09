package streamapi;

import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Smith", "Cardiology", true),
                new Doctor("Dr. Patel", "Neurology", false),
                new Doctor("Dr. Lee", "Orthopedics", true),
                new Doctor("Dr. Kim", "Dermatology", true)
        );

        doctors.stream()
                .filter(d -> d.availableOnWeekend)
                .sorted(Comparator.comparing(d -> d.specialty))
                .forEach(d -> System.out.println(d.name + " - " + d.specialty));
    }
}