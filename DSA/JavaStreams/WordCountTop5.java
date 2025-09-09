package DSA.JavaStreams;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class WordCountTop5 {
    public static void main(String[] args) {
        String file = "sample.txt";
        Map<String, Integer> freqMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sort by frequency (descending) and take top 5
            freqMap.entrySet().stream()
                   .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                   .limit(5)
                   .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
