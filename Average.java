/*
 * Program 1.5.3
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            double value = in.nextDouble();
            sum += value;
            n++;
        }
        in.close();
        double average = sum / n;
        System.out.println("Average is: " + average);
    }

}
