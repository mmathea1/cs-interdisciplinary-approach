public class Ex131 {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a == b && b == c) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}