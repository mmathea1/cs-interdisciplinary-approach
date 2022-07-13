
public class isLeapYear {
    public static void main(String[] args) throws Exception {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        System.out.println("Is leap year? " + isLeapYear);
    }
}
