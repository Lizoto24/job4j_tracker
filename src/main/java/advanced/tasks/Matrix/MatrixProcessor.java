package advanced.tasks.Matrix;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixProcessor {
    public static List<Integer>  getTopUniqueSortedDescending (List<Matrix> matrices) {
        return matrices.stream()
                .flatMap(matrix -> matrix.getValue().stream())
                .flatMap(row-> row.stream())
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
    }
}
