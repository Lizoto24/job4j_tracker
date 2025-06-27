package stream;

import java.util.List;

public class ReduceMethodOneArgument {
    public static Integer reduce(List<Integer> list) {
        Integer sum = list.stream()
                .reduce((a, b) -> a * b)
                .get();

        return sum;
    }
}
