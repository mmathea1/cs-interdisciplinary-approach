public class Ruler2 {
    public static void main(String[] args) {
        String ruler = "1";
        int n = Integer.parseInt(args[0]);
        for (int i = 2; i <= n; i++) {
            System.out.println(ruler);
            ruler = ruler + " " + i + " " + ruler;
        }
        System.out.println(ruler);
    }
}
