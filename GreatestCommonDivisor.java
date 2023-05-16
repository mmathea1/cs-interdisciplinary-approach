public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int rem = 1;
        int gcd = 1;
        while (rem > 0) {
            rem = x % y;
            x = y;

            if (rem == 0) {
                gcd = y;
            }
            y = rem;
        }
        System.out.println("gcd = " + gcd);
    }
}