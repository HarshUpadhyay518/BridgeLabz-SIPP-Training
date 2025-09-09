package DSA.Collections.MapInterface;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> freqMap = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", " "); // remove punctuation
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println(countWords(input)); // {hello=2, world=1, java=1}
    }
}

