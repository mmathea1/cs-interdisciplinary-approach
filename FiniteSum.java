public class FiniteSum {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
