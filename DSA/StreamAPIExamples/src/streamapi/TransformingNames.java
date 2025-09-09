package streamapi;

import java.util.*;

public class TransformingNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("harsh", "alice", "bob", "david");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}