package stream;

import java.util.List;
import java.util.stream.Collectors;

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        List<Integer> result = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        return result;
    }
}