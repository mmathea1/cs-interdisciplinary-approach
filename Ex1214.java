public class Ex1214 {
    public static void main(String[] args) throws Exception {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        if (val1 % val2 == 0 || val2 % val1 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
