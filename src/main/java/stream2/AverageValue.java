package stream2;

import java.util.List;
import java.util.OptionalDouble;

public class AverageValue {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(17, 34, 40, 56, 32, 12, 7, 39, 85, 16);
        Double result = numbers.stream()
                .mapToInt(number -> number)
                .average()
                .getAsDouble();

        System.out.println(result);
    }
}
