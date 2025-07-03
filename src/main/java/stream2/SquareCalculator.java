package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class SquareCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7);
        List<Integer> result = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        result.forEach(number-> System.out.println(number));
    }
}
