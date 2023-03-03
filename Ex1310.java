/*
* Write a program that takes an integer command-line argument n, uses
* Math.random() to print n uniform random values between 0 and 1, and then
* prints their average value
*/
public class Ex1310 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double val = Math.random();
            System.out.println("Val " + i + " = " + val);
            sum += val;
        }
        double average = sum / n;
        System.out.println("Average = " + average);
    }
}