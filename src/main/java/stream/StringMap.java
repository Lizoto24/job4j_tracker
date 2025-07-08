package stream;

import java.util.List;
import java.util.stream.Collectors;

public class StringMap {
    public static List<String> map(List<String> names) {
        List<String> result = names.stream()
                .map(string -> string + ".java")
                .collect(Collectors.toList());

        return result;
    }
}
