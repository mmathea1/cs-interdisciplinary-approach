public class EuclideanDistance {
    public static void main(String[] args) throws Exception {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[0]);
        int a = (x - 0) * (x - 0);
        int b = (y - 0) * (y - 0);
        double distance = Math.sqrt(a + b);
        System.out.println("Euclidean Distance: " + distance);
    }
}