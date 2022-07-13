// expressing the quadratic formula using java
public class Quadratic {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double discriminant = b * b - 4.0 * a * c;
        double d = Math.sqrt(discriminant);
        double denominator = (2 * a);
        double posX = (-b + d) / denominator;
        double negX = (-b - d) / denominator;
        System.out.println("X = " + posX + " or X= " + negX);
    }
}
