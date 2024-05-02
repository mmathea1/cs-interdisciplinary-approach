public class Kary {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        int base;
        StringBuilder result = new StringBuilder();
        int remainder;

        if (k >= 2 && k <= 16) {
            base = k;
        } else {
            base = 10;
        }

        while (i > 0) {
            remainder = i % base;
            if (base == 16) {
                if (remainder == 10) {
                    result.append('A');
                } else if (remainder == 11) {
                    result.append('B');
                } else if (remainder == 12) {
                    result.append('C');
                } else if (remainder == 13) {
                    result.append('D');
                } else if (remainder == 14) {
                    result.append('E');
                } else if (remainder == 15) {
                    result.append('F');
                } else {
                    result.append(remainder);
                }
            } else {
                result.append(remainder);
            }
            i /= base;
        }
        System.out.println(result.reverse().toString());

    }
}