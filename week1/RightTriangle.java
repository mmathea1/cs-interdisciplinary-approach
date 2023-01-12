public class RightTriangle {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double d = c * c;
        double e = (a * a) + (b * b);
        System.out.println(d == e);
    }
}