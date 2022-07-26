public class DiceRoll {
    public static void main(String[] args) throws Exception {
        int answer = (int) (Math.random() * (6 - 1 + 1) + 1);
        System.out.println(answer);
    }
}
