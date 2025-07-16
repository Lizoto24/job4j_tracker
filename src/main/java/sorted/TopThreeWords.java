package sorted;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopThreeWords {
    public static List<String> sortThreeLongWords(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}

class SortedMain {
    public static void main(String[] args) {
        List<String> list = List.of("puppy", "dog", "goldfish", "ferret", "panther");
        List<String> result = TopThreeWords.sortThreeLongWords(list);
        System.out.println(result);
    }
}
