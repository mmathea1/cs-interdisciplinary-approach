
/** Duplicate an array
 * 
 */
import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] array = new double[n];
        double[] duplicateArray = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }
        for (int i = 0; i < n; i++) {
            duplicateArray[i] = array[i];
        }
        System.out.println("Initial Array: " + Arrays.toString(array));
        System.out.println("Duplicate Array: " + Arrays.toString(duplicateArray));
    }
}