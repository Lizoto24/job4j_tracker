package advanced.tasks.Matrix;

import java.util.List;

public class Matrix {
    private List<List<Integer>> value;

    public Matrix (List<List<Integer>> value) {
        this.value = value;
    }

    public List<List<Integer>> getValue() {
        return value;
    }
}
