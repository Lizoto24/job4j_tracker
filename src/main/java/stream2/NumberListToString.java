package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class NumberListToString {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        String result = numbers.stream()
                .map(number -> number.toString())
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println(result);
    }
}
