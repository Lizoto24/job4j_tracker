package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 6, 8, 9, 12, 14, 16);
        List<Integer> result = numbers.stream()
                .peek(number -> System.out.println("Before map: " + number))
                .map(number -> number * 2)
                .peek(number -> System.out.println("After map: " + number))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
