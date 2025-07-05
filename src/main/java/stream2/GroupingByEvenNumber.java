package stream2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEvenNumber {
    public static void main(String[] args) {
        List<Integer> number = List.of(4, 6, 11, 15, 17, 20, 24, 31, 28);
        Map<Boolean, List<Integer>> grouped = number.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(grouped);
    }
}
