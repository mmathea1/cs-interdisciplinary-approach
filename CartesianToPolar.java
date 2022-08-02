public class CartesianToPolar {
    public static void main(String[] args) throws Exception {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x*x + y*y);
        double t = Math.atan2(y, x);

        System.out.println("r: " + r + " theta: " + t);
    }
}
