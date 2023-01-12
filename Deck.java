import java.util.Arrays;

/**
 * Generate and print a deck of cards
 * 
 * @author mmathea1
 */
public class Deck {

    public static String[] shuffleCards(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        return deck;
    }

    public static void main(String[] args) {
        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] DECK = new String[RANKS.length * SUITS.length];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                DECK[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
            }
        }
        for (int i = 0; i < DECK.length; i++) {
            System.out.println(DECK[i]);
        }

        String[] result = shuffleCards(DECK);
        System.out.println();
        System.out.println("Shuffling...");
        System.out.println("--------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}