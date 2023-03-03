/*
 * Write a program FunctionGrowth that prints a table of the values log n, n,
 * n log n, n 2, n 3, and 2 n for n = 16, 32, 64, ... , 2,048. 
 * Use tabs (\t characters) to align columns.
 */

public class FunctionGrowth {
    public static void main(String args[]) {
        // double n = Double.parseDouble(args[0]);
        System.out.print(" log n" + "\t ");
        System.out.print(" n" + "\t ");
        System.out.print(" n loge n " + "\t ");
        System.out.print(" n^2" + "\t ");
        System.out.print(" n^3" + "\t ");
        System.out.print(" 2^n" + "\t ");
        System.out.println(" ");
        int n = 16;
        while (n <= 2048) {
            System.out.print((n * Math.log(n)) + "\t ");
            System.out.print(n + "\t ");
            System.out.print(Math.pow(n, 2) + "\t ");
            System.out.print(Math.pow(n, 3) + "\t ");
            System.out.print(Math.pow(2, n) + "\t ");
            System.out.print(n * Math.log10(n) + "\t ");
            System.out.println(" ");
            n = n * 2;
        }

    }
}