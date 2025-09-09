package streamapi;

import java.time.*;
import java.util.*;
import java.time.temporal.ChronoUnit;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Alice", LocalDate.now().plusDays(10)),
                new Member("Bob", LocalDate.now().plusDays(40)),
                new Member("Charlie", LocalDate.now().plusDays(25))
        );

        members.stream()
                .filter(m -> ChronoUnit.DAYS.between(LocalDate.now(), m.expiryDate) <= 30)
                .forEach(m -> System.out.println(m.name + " expires on " + m.expiryDate));
    }
}