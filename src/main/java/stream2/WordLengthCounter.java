package stream2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthCounter {
    public static void main(String[] args) {
        List<String> words = List.of("cat", "dog", "parrot", "hamster", "bear", "elephant", "horse");
        Map<Integer, Long> countByLength = words.stream()
                .collect(Collectors.groupingBy(word -> word.length(),
                        Collectors.counting()
                ));
        System.out.println(countByLength);
    }
}
