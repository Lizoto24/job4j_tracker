package stream;

import java.util.Arrays;

public class FlatMapForPrimitive {
    public static int sum(int[][] matrix) {
        int sum = Arrays.stream(matrix)
                .flatMapToInt(row -> Arrays.stream(row))
                .sum();

        return sum;
    }
}