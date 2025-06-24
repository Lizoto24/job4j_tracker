package bell;

public class MatrixFiller {
    public static void main(String[] args) {
        int[] sizes = {4, 6, 8};

        for (int n : sizes) {
            System.out.println("Матрица " + n + "x" + n + ":");
            int[][] matrix = buildMatrix(n);
            printMatrix(matrix);               
            System.out.println();
        }
    }

    public static int[][] buildMatrix(int n) {
        int[][] matrix = new int[n][n];
        int numberOfLayers = n / 2;

        for (int layer = 0; layer < numberOfLayers; layer++) {
            int value = numberOfLayers - 1 - layer;

            for (int j = layer; j < n - layer; j++) {
                matrix[layer][j] = value;
                matrix[n - 1 - layer][j] = value;
            }
            for (int i = layer + 1; i < n - 1 - layer; i++) {
                matrix[i][layer] = value;
                matrix[i][n - 1 - layer] = value;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}