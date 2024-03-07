public class RandomInt {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int v = (int) (r * n);

        System.out.println(v);
    }
}
