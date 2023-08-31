/*
 * Program 1.5.4
 */

import java.util.Scanner;

public class RangeFilter {
    public static void main(String[] args) {
        int lo = Integer.parseInt(args[0]);
        int hi = Integer.parseInt(args[1]);
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int value = in.nextInt();
            if (value >= lo && value <= hi) {
                System.out.print(value + " ");
            }
        }
        in.close();
        System.out.println();

    }

}
