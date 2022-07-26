public class Ex1221 {
    public static void main(String[] args) throws Exception {
        double t = Double.parseDouble(args[0]);
        double answer = Math.sin(2 * t) + Math.sin(3 * t);
        System.out.println(answer);
    }

}
