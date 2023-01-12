public class GreatCircle {
    public static void main(String[] args) {

        double args1 = Double.parseDouble(args[0]);
        double args2 = Double.parseDouble(args[1]);
        double args3 = Double.parseDouble(args[2]);
        double args4 = Double.parseDouble(args[3]);
        double r = 6371.0;
        double x1 = Math.toRadians(args1);
        double x2 = Math.toRadians(args2);
        double y1 = Math.toRadians(args3);
        double y2 = Math.toRadians(args4);
        double sin = Math.sin(0.0);

        double d = 2 * r * Math.asin(Math
                .sqrt((sin * sin) * ((x2 - x1) / 2) + (Math.cos(x1) * Math.cos(x2) * (sin * sin) * ((y2 - y1) / 2))));
        System.out.println(d + " kilometers");
    }

}