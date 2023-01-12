/**
 * Generate an array containing random elements
 * 
 */
public class RandomValuesArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.random();
        }
    }
}