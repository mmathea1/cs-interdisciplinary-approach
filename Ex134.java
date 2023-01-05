class Ex134 {
    public static void main(String[] args) throws Exception {
        double x = Math.random();
        double y = Math.random();
        System.out.println("X = " + x + " Y = " + y);
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}