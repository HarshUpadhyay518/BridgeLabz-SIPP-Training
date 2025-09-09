package DSA.Collections.SetInterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        // Sample policies
        Policy p1 = new Policy("P001", "Alice", LocalDate.now().plusDays(10), "Health", 1200);
        Policy p2 = new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 800);
        Policy p3 = new Policy("P003", "Charlie", LocalDate.now().plusDays(25), "Home", 600);

        // Different sets
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate));

        // Run performance test
        testSetPerformance("HashSet", hashSet, p1, p2, p3);
        testSetPerformance("LinkedHashSet", linkedHashSet, p1, p2, p3);
        testSetPerformance("TreeSet", treeSet, p1, p2, p3);
    }

    private static void testSetPerformance(String setName, Set<Policy> set, Policy... policies) {
        System.out.println("\n--- Testing " + setName + " ---");

        // Measure add time
        long start = System.nanoTime();
        for (Policy p : policies) {
            set.add(p);
        }
        long end = System.nanoTime();
        System.out.println("Add time: " + (end - start) + " ns");

        // Measure search time
        start = System.nanoTime();
        boolean found = set.contains(policies[1]); // search Bob's policy
        end = System.nanoTime();
        System.out.println("Search time: " + (end - start) + " ns (found=" + found + ")");

        // Measure remove time
        start = System.nanoTime();
        set.remove(policies[0]); // remove Alice's policy
        end = System.nanoTime();
        System.out.println("Remove time: " + (end - start) + " ns");
    }
}
