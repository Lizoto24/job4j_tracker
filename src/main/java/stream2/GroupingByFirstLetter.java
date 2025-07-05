package stream2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByFirstLetter {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "animal", "beef", "chicken", "duck", "bag", "egg", "ham", "cat", "door");
        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> Character.toLowerCase(word.charAt(0))));

        System.out.println(grouped);
    }
}
