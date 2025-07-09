package stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(string -> string.startsWith("A"))
                .filter(string -> string.endsWith("java"))
                .collect(Collectors.toList());
    }
}
