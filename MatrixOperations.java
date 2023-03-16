public class MatrixOperations {
    public static void main(String[] args) {

        double a[][] = {
                { .70, .20, .10 },
                { .30, .60, .10 },
                { .50, .10, .40 }
        };
        double b[][] = {
                { .20, .30, .50 },
                { .10, .20, .10 },
                { .10, .30, .40 }
        };
        int n = a[0].length;
        double c[][] = new double[n][n];
        System.out.println("Addition");
        // addition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Multiplication");
        // dot product
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}