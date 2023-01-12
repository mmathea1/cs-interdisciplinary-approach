import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }
        System.out.println("Before: " + Arrays.toString(array));
        for (int i = 0; i < n / 2; i++) {
            double temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        System.out.println("Reversed: " + Arrays.toString(array));
    }
}