package bell;

public class MinElementDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {5, 7, 9, 2, 1},
                {0, 9, 1, 8, 7},
                {6, 3, 6, 6, 6},
                {99, 100, -2, 3, 3}
        };
        int n = matrix.length;
        int min = matrix[0][n - 1];
        int j = 0;

        for (int i = n - 1; i > 0; i--) {
            if (i == j) {
                j++;
                continue;
            }

            if (matrix[i][j] < min) {
                min = matrix[i][j];
            }
            j++;
        }
        System.out.println(min);
    }

}

