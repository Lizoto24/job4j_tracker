package stream;

import java.util.List;

public class AnyMatchMethod {
    public static boolean check(List<String> data) {
        return data.stream().anyMatch(string -> string.startsWith("job4j"));
    }
}