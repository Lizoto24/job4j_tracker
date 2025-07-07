package stream2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        List<String> words = List.of("mouse", "chinchilla", "cat", "mouse", "chinchilla", "cat", "pig", "mouse", "rat", "chinchilla", "mouse");
        Map<String, Long> wordFrequencies = words.stream()
                .collect(Collectors.groupingBy(word -> word,
                        Collectors.counting()

                ));

        System.out.println("Частота слов: " + wordFrequencies);

    }
}
