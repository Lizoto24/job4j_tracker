package sorted;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {
    public static List<String> sortByLength (List<String> data) {
        return data.stream()
                .sorted(Comparator.comparingInt(string-> string.length()))
                .collect(Collectors.toList());
    }
}

class Main{
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "kiwi","pear", "mango", "lemon");
        List<String> result = StringSorter.sortByLength(list);
        System.out.println(result);
    }
}
