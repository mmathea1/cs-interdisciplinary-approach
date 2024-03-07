public class IntOps {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int m = a + b;
        int p = a * b;
        int q = a / b;
        int r = a % b;
        System.out.println(a + " + " + b + " = " + m);
        System.out.println(a + " * " + b + " = " + p);
        System.out.println(a + " / " + b + " = " + q);
        System.out.println(a + " % " + b + " = " + r);
    }
}
