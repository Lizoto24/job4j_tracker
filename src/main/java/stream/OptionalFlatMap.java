package stream;

import java.util.List;
import java.util.Optional;

public class OptionalFlatMap {
    public static Optional<Integer> flatMap(List<String> strings) {
        Optional<Integer> result = strings.stream()
                .filter(string -> string.endsWith("java"))
                .findFirst()
                .map(string -> string.length());

        return result;
    }
}
