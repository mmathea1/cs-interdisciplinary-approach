public class Ex1222 {
    public static void main(String[] args) throws Exception {
        double x = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        double answer = x + v * t - g * t * t / 2;
        System.out.println(answer);
    }
}
