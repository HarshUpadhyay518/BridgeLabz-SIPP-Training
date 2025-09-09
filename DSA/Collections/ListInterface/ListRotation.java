package DSA.Collections.ListInterface;

import java.util.*;

public class ListRotation {
    public static <T> List<T> rotateList(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return list;

        k = k % n; // handle cases where k > n
        if (k < 0) k += n; // handle negative rotations

        // new list = part from k to end + part from 0 to k
        List<T> rotated = new ArrayList<>();
        rotated.addAll(list.subList(k, n));
        rotated.addAll(list.subList(0, k));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Original: " + list);
        System.out.println("Rotated by 2: " + rotateList(list, 2));
    }
}

