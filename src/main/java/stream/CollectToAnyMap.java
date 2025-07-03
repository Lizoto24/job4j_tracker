package stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToAnyMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        Map<Integer, Integer> result = data.collect(Collectors.toMap(k -> k, k -> k * k, (prev, curr) -> prev, () -> new LinkedHashMap<>()));
        return result;
    }
}
