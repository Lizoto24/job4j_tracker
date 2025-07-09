package stream;

import java.util.List;
import java.util.stream.Collectors;

public class DropWhileMethod {
    public static List<Integer> dropWhile(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .sorted()
                .dropWhile(number -> number < 0)
                .collect(Collectors.toList());

        return result;
    }
}