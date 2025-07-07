package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class StringLengthMapper2 {
    public static void main(String[] args) {
        List<String> words = List.of("apple ", "banana ", "orange ", "pear ", "lime ", "fig");
        List<Integer> length = words.stream()
                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println(length);
    }
}
