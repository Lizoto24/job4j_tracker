package stream;

import java.util.List;
import java.util.stream.Collectors;

public class SkipMethod {
    public static List<String> lastThree(List<String> strings) {
        List<String> result = strings.stream()
                .skip(2)
                .collect(Collectors.toList());

        return result;
    }
}