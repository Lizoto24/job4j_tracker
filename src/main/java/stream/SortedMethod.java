package stream;

import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static List<String> sorted(List<String> strings) {
        List<String> result = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        return result;
    }
}