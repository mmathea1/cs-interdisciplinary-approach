class Ex137 {

    public static void main(String[] args) {
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j += i;

        }
        System.out.println("J: " + j);
        int k = 1;
        for (int i = 0; i < 10; i++) {
            k += k;

        }
        System.out.println("K: " + k);

        for (int l = 0; l < 10; l++) {
            l += l;
            if (l > 8) {
                System.out.println("L: " + l);
            }
        }
        int m = 0;
        for (int n = 0; n < 10; n++) {
            m += m++;
        }
        System.out.println("M: " + m);

    }
}