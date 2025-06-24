package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {
    public static Stream<Integer> createStream(Integer[] data) {
        Stream <Integer> dataStream = Arrays.stream(data);
        return dataStream;
    }
}