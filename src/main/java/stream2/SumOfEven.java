package stream2;

import java.util.List;

public class SumOfEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,5,4,7,8,14,19,25,59,40);
        int result = numbers.stream()
                .filter(number -> number%2==0)
                .mapToInt(number-> number)
                .sum();

        System.out.println("Результат: " + result);
    }
}
