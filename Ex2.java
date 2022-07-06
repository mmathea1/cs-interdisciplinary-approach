

public class Ex2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Hi ");
        int argslength = args.length - 1;
        for (int i = 0; i < args.length; i++) {
            if (i < args.length) {
                System.out.print(" " + args[i]);
            } else {
                System.out.print(" and" + args[argslength]);
            }
        }
    }
}