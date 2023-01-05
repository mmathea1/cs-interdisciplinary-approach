public class UniformRandomNumbers {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        double total = a + b + c + d + e;
        double average = total / 5;
        double min1 = Math.min(a, b);
        double min2 = Math.min(min1, c);
        double min3 = Math.min(min2, d);
        double min4 = Math.min(min3, e);
        double max1 = Math.max(a, b);
        double max2 = Math.max(max1, c);
        double max3 = Math.max(max2, d);
        double max4 = Math.max(max3, e);
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d + ", e: " + e);
        System.out.println("Average: " + Double.toString(average) + " min: " + Double.toString(min4) + " max: "
                + Double.toString(max4));
    }
}
