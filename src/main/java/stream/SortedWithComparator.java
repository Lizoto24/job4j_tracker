package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedWithComparator {
    public static List<String> sorted(List<String> strings) {
        List<String> result = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return result;
    }
}
