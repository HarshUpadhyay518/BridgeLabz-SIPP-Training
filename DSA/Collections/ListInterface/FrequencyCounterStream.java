package DSA.Collections.ListInterface;

import java.util.*;
import java.util.stream.*;

public class FrequencyCounterStream {
    public static Map<String, Long> countFrequency(List<String> list) {
        return list.stream()
                   .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Long> result = countFrequency(input);
        System.out.println(result); // {orange=1, banana=1, apple=2}
    }
}
