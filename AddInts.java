import java.util.Scanner;

public class AddInts {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            int value = scanner.nextInt();
            sum += value;
        }
        scanner.close();
        System.out.println("Sum is " + sum);

    }

}
