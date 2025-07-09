package stream;

import java.util.List;
import java.util.stream.Collectors;

public class LimitMethod {
    public static List<String> firstThree(List<String> strings) {
        List<String> result = strings.stream()
                .limit(3)
                .collect(Collectors.toList());

        return result;
    }
}
