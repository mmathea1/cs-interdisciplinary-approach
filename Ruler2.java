public class Ruler2 {
    public static void main(String[] args) {
        String ruler = " ";
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            ruler = ruler + i + ruler;
            System.out.println(ruler);
        }
    }
}
