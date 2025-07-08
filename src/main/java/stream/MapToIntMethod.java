package stream;

import java.util.List;

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
       long sum = characters.stream()
                .mapToLong(character -> character)
                .sum();

        return sum;
    }
}