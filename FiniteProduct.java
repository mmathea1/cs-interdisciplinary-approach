public class FiniteProduct {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
            System.out.println(i + "  " + product);
        }
    }
}
