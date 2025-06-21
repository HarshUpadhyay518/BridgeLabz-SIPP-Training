package CoreJava.BuiltInFunction;

import java.time.LocalDate;

public class question2 {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 6, 21); // You can change the input date
        System.out.println("Original Date: " + inputDate);

        LocalDate addedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + addedDate);

        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);
    }
}
