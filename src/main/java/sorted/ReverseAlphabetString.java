package sorted;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAlphabetString {
    public static List<String> sortStringReverseAlphabet(List<String> data) {
        return data.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}

class StringSorterReverse {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "kiwi", "kiwi", "banana", "pear", "mango", "lemon", "apple");
        List<String> result = ReverseAlphabetString.sortStringReverseAlphabet(words);
        System.out.println(result);
    }
}

