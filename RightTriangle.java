public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        boolean p = (a > 0 && b > 0 && c > 0);

        boolean q = (a2 + b2 == c2);

        System.out.println((p && q));
    }
}