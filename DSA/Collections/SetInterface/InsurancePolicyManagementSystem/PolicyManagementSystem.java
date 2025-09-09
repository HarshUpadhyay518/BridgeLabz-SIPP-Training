package DSA.Collections.SetInterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManagementSystem {
    private Set<Policy> hashSet = new HashSet<>();                   // fast lookup
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();       // maintains insertion order
    private Set<Policy> treeSet = new TreeSet<>(Comparator.comparing(Policy::getExpiryDate)); // sorted by expiry date

    // Add a policy to all sets
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Retrieve all unique policies
    public void displayAllPolicies() {
        System.out.println("HashSet Policies: " + hashSet);
        System.out.println("LinkedHashSet Policies: " + linkedHashSet);
        System.out.println("TreeSet Policies (Sorted by Expiry): " + treeSet);
    }

    // Retrieve policies expiring soon (within 30 days)
    public List<Policy> getExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate cutoff = now.plusDays(30);
        List<Policy> result = new ArrayList<>();
        for (Policy p : hashSet) {
            if (!p.getExpiryDate().isBefore(now) && !p.getExpiryDate().isAfter(cutoff)) {
                result.add(p);
            }
        }
        return result;
    }

    // Retrieve policies by coverage type
    public List<Policy> getByCoverageType(String type) {
        List<Policy> result = new ArrayList<>();
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                result.add(p);
            }
        }
        return result;
    }

    // Find duplicates (based on policy number)
    public List<Policy> findDuplicates(List<Policy> policies) {
        Set<String> seen = new HashSet<>();
        List<Policy> duplicates = new ArrayList<>();
        for (Policy p : policies) {
            if (!seen.add(p.getPolicyNumber())) {
                duplicates.add(p);
            }
        }
        return duplicates;
    }
}
