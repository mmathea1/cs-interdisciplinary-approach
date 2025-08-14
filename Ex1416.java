public class Ex1416 {
        static int[][] mat1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        static int[][] mat2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

    public static void main(String[] args) {
       
        if (mat1[0].length != mat2.length) {
            System.out.println("Error: Matrices cannot be multiplied due to incompatible arrays.");
            return;
        }

        int[][] result = new int[mat1.length][mat2[0].length];

        for(int i = 0; i < mat1.length; i++) {
            for(int j = 0; j < mat2[0].length; j++){
                int sum = 0;
                for(int k = 0; k < mat1[0].length; k++) {
                    sum += mat1[i][k] * mat2[k][j];
                }
                result[i][j] = sum;
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}