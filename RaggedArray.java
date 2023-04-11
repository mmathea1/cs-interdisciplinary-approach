/*
 * prints contents of a ragged array
 */
public class RaggedArray {
    public static void main(String[] args) {
        int[][][] a = new int[6][8][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}