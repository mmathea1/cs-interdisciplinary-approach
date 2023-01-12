import java.util.Arrays;

/**
 * print max value of the generated array
 * 
 */
public class ArrayMaxValue {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] array = new double[n];
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();

        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < n; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Max value= " + max);
    }
}