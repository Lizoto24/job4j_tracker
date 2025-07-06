package stream2;

import java.util.Comparator;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,8,9,17,23,1,67,21,2,5,3);
        int result = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(result);
    }
}
