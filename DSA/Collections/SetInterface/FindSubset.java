package DSA.Collections.SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubset {
    Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));

boolean isSubset = superset.containsAll(subset);
// System.out.println("Is subset? " + isSubset); // true

}
