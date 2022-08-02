import java.time.LocalDate;

public class Ex1223 {
    public static void main(String[] args) throws Exception {
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        LocalDate date1 = LocalDate.of(year, d, m);
        LocalDate march = LocalDate.of(year, 3, 20);
        LocalDate july = LocalDate.of(year, 6, 20);
        if (date1.isAfter(march) && date1.isBefore(july)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
