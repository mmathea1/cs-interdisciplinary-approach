/**
 * implementation Haversine Distance Algorithm between two places
 */
public class GreatCircle {
    /**
     * @param args
     *             arg 1- latitude 1
     *             arg 2 — longitude 1
     *             arg 3 — latitude 2
     *             arg 4 — longitude 2
     */
    public static void main(String[] args) {

        double startLat = Double.parseDouble(args[0]);
        double endLat = Double.parseDouble(args[2]);
        double startLong = Double.parseDouble(args[1]);
        double endLong = Double.parseDouble(args[3]);
        double r = 6371.0;

        double dLat = Math.toRadians((startLat - endLat));
        double dLong = Math.toRadians((startLong - endLong));
        startLat = Math.toRadians(startLat);
        endLat = Math.toRadians(endLat);
        double haversine1 = Math.pow(Math.sin(dLat / 2), 2);
        double haversine2 = Math.pow(Math.sin(dLong / 2), 2);
        double a = haversine1 + Math.cos(startLat) * Math.cos(endLat) * haversine2;
        double b = r * 2 * Math.asin(Math.sqrt(a));
        // double d = r * b
        System.out.println(b + " kilometers");
    }

}