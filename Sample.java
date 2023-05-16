/*
 * print a random sample of m integers
 * from 0 to n-1 no duplicates
 */
public class Sample {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        // initialise perm
        int[] perm = new int[n];
        for (int j = 0; j < n; j++) {
            perm[j] = j;
        }

        for (int i = 0; i < m; i++) {
            int random = (int) Math.random();
            int r = i + (random * (n - i));
            System.out.println("i = " + i + " r = " + r + " random = " + random + " n-i= " + (n - i));
            int t = perm[r];
            perm[r] = perm[i];
            perm[i] = t;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
        }
        System.out.println();
    }

}
