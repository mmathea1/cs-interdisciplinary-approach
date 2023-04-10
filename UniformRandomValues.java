public class UniformRandomValues {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i < n; i++) {
            double v = Math.random();
            sum += v;
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("Average: " + sum / n);
    }
}