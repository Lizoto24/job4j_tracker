package stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapForObject {
    public static List<Integer> flatMap(List<List<Integer>> lists) {
        List<Integer> result = lists.stream()
                .flatMap(subList -> subList.stream())
                .collect(Collectors.toList());

        return result;
    }
}