public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        if (t > Math.abs(50.0) || v > 120.0 || v < 3.0) {
            System.out.println("Wind Chill invalid values");
        }
        double m = Math.pow(v, 0.16);
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * m;
        System.out.println("Wind chill: " + w);
    }
}
