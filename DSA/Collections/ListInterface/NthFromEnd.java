package DSA.Collections.ListInterface;

import java.util.*;

public class NthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0 || list.isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }

        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        // Step 1: Move 'first' n steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            first.next();
        }

        // Step 2: Move both until 'first' reaches end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // Step 3: 'second' now points to Nth from end
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        System.out.println("List: " + list);
        System.out.println("Nth from end (N=" + N + "): " + findNthFromEnd(list, N));
    }
}

