public class Ex1215 {
    public static void main(String[] args) throws Exception {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int[] edges = { a, b, c };
        boolean valid = false;
        boolean valid0 = false;
        boolean valid1 = false;
        boolean valid2 = false;
        for (int i = 0; i < edges.length; i++) {
            if (i == 0) {
                if (edges[0] < edges[1] + edges[2]) {
                    valid0 = true;
                }
            } else if (i == 1) {
                if (edges[1] < edges[0] + edges[2]) {
                    valid1 = true;
                }
            } else if (i == 2) {
                if (edges[2] < edges[1] + edges[0]) {
                    valid2 = true;
                }
            }
        }
        if (valid0 && valid1 && valid2) {
            valid = true;
        }

        System.out.println("valid ? " + valid);
    }
}
