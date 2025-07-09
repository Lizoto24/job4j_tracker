package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctForPrimitive {
    public static List<Integer> collect(int[] data) {
        List<Integer> result = Arrays.stream(data)
                .distinct()
                .boxed()
                .collect(Collectors.toList());

        return result;
    }
}