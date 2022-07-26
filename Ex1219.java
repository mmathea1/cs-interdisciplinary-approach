public class Ex1219 {
    public static void main(String[] args) throws Exception {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int answer = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(answer);
    }
}
