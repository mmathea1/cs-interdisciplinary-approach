public class IntOps {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int p = a * b;
        int q = a / b;
        int r = a % b;
        System.out.println("Multiplication: " + p);
        System.out.println("Division: " + q);
        System.out.println("Modulus: " + r);
    }
}
