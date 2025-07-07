package stream;

import java.util.List;
import java.util.Optional;

public class FindFirstMethod {
    public static Optional<Integer> first(List<Integer> list) {
        Optional<Integer> result = list.stream().findFirst();
        return result;
    }
}