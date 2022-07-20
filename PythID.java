public class PythID {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double cos = Math.cos(a) * Math.cos(a);
        double sin = Math.sin(a) * Math.sin(a);
        double val = cos + sin;
        System.out.println("Answer: " + val);
    }
}
