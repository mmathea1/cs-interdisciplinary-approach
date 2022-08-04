public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y1 = y - (14 - m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m1 = m + 12 * ((14 - m) / 12) - 2;
        int d1 = (d + x + (31 * m1) / 12) % 7;

        if (d1 == 0) {
            System.out.println("Sunday");
        }
        if (d1 == 1) {
            System.out.println("Monday");
        }
        if (d1 == 2) {
            System.out.println("Tuesday");
        }
        if (d1 == 3) {
            System.out.println("Wednesday");
        }
        if (d1 == 4) {
            System.out.println("Thursday");
        }
        if (d1 == 5) {
            System.out.println("Friday");
        }
        if (d1 == 6) {
            System.out.println("Saturday");
        }
    }
}