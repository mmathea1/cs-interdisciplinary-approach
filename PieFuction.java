public class PieFuction {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i <= n; i++) {
            double x = 2 * Math.PI * i / n;
            System.out.println(i + " " + x);
        }
    }
}
