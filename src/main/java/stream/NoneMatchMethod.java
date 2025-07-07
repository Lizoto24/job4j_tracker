package stream;

import java.util.List;

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        boolean result = list.stream()
                .noneMatch(string -> string.isEmpty());

        return result;
    }
}