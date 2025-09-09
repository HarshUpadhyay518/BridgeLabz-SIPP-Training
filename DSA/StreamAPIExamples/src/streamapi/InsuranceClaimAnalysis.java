package streamapi;

import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 1200.0),
                new Claim("Health", 800.0),
                new Claim("Auto", 3000.0),
                new Claim("Auto", 2500.0),
                new Claim("Life", 10000.0)
        );

        Map<String, Double> avgClaims = claims.stream()
                .collect(Collectors.groupingBy(c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)));

        avgClaims.forEach((type, avg) -> System.out.println(type + " Avg: " + avg));
    }
}