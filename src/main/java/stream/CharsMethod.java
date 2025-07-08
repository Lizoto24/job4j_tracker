package stream;

import java.util.List;
import java.util.stream.Collectors;

public class CharsMethod {
    public static List<Character> symbols(String string) {
        List<Character> result = string.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toList());

        return result;
    }
}
