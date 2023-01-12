/**
 * Print elements of an array in a new line
 * 
 */
public class PrintArrayValues {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}