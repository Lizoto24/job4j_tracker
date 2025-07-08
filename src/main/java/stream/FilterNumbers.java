package stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        List<Integer> numbers = data.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        return numbers;
    }
}