public class TenHellos {
    public static void main(String[] args) throws Exception {

        int j = Integer.parseInt(args[0]);
        int i = 1;
        do {
            switch (i) {
                case 1:
                    System.out.println(i + "st Hello");
                    break;
                case 2:
                    System.out.println(i + "nd Hello");
                    break;
                case 3:
                    System.out.println(i + "rd Hello");
                    break;
                default:
                    System.out.println(i + "th Hello");
                    break;
            }
            i++;

        } while (i <= j);

    }
}
