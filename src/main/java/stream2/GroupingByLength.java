package stream2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {
    public static void main(String[] args) {
        List<String> words = List.of("sugar", "milk", "vegetables", "honey", "porridge");
        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> word.length()));

        System.out.println(grouped);
    }
}
