package CoreJava.Methods;

public class question30 {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = (int)(Math.random() * 10);
        return mat;
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        return new double[][] {
            { m[1][1]/(double)det, -m[0][1]/(double)det },
            { -m[1][0]/(double)det, m[0][0]/(double)det }
        };
    }

    public static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
