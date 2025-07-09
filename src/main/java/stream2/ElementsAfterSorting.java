package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class ElementsAfterSorting {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(44,7,3,22,89,1,68);
        List <Integer> result = numbers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        result.forEach(number -> System.out.println(number));
    }
}
