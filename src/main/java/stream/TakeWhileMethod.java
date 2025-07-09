package stream;

import java.util.List;
import java.util.stream.Collectors;

public class TakeWhileMethod {
    public static List<Integer> takeWhile(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .sorted()
                .takeWhile(number -> number < 0)
                .collect(Collectors.toList());

        return result;
    }
}
