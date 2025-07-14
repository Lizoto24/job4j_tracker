package advanced.tasks.Matrix;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(Arrays.asList(
                Arrays.asList (1,2,3),
                Arrays.asList(1,2,3)
        ));
        Matrix m2 = new Matrix(Arrays.asList(
                Arrays.asList (3,4,7),
                Arrays.asList(8,8,10)
        ));

        List<Matrix> matrices = Arrays.asList(m1,m2);
        List<Integer> result = MatrixProcessor.getTopUniqueSortedDescending(matrices);
        System.out.println(result);
    }
}
