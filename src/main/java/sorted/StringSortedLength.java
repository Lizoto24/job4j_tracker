package sorted;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortedLength {
    public static List<String> sortStringsByLength(List<String> data) {
        return data.stream()
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());
    }
}

class Sorted {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "kiwi", "pear", "mango", "lemon");
        List<String> result = StringSortedLength.sortStringsByLength(list);
        System.out.println(result);
    }
}




