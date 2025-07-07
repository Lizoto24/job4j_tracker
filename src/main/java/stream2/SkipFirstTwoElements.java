package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class SkipFirstTwoElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 19, 20, 23, 15, 6);
        List<Integer> result = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
