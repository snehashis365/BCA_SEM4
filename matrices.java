public class matrices {
    //multiply two matrices
    public static double[][] multiply(double[][] A, double[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        double[][] C = new double[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    //main method
    public static void main(String[] args) {
        double[][] A = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        double[][] B = { {5, 4, 3}, {6, 9, 6}, {1, 2, 1} };
        double[][] C = multiply(A, B);
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
