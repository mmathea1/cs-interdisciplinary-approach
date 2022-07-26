// expressing the quadratic formula using java
public class Quadratic {

    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        double posX = ((-b + d) / 2.0);
        double negX = ((-b - d) / 2.0);
        System.out.println("root1 = " + posX + " or root2 = " + negX);
    }
}
