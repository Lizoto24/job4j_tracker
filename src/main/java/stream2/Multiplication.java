package stream2;

import java.util.List;

public class Multiplication {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, 15, 18, 4, 6, 7, 18, 22);
        Integer result = numbers.stream()
                .reduce(1, (n1, n2) -> n1 * n2);

        System.out.println(result);
    }
}
