package stream;

import java.util.stream.Stream;

public class CountMethod {
    public static long count(Stream<Integer> data) {
        long count = data.count();
        return count;

    }
}