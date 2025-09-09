import java.util.*;
import java.util.stream.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String paragraph = "hello world hello java world java java stream collectors";
        List<String> words = Arrays.asList(paragraph.split(" "));

        Map<String, Long> wordCount = words.stream()
            .collect(Collectors.toMap(
                word -> word,
                word -> 1L,
                Long::sum
            ));

        System.out.println(wordCount);
    }
}
