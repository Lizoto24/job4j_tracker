package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
       IntStream stream = Arrays.stream(data);
       return stream;
    }
}