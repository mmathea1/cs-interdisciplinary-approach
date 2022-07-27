public class CompoundInterest {
    public static void main(String[] args) throws Exception {
        int P = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        double A = Math.pow((P * Math.E), (r * t));
        System.out.println("Compound Interest: " + A);
    }
}
