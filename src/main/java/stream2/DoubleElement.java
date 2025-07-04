package stream2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DoubleElement {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 9, 12, 9, 52);
        Set<Integer> result = numbers.stream()
                .map(number -> number * 2)
                .collect(Collectors.toSet());

        System.out.println(result);

    }
}
