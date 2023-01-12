public class ArrayAverage {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random();
        }
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = sum / n;
        System.out.println("Average: " + average);
    }
}