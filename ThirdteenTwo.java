import java.util.ArrayList;
import java.util.Random;


 class ThirdteenTwo {
    ArrayList<Card> cards = new ArrayList<>();
    static Random random = new Random(); // Class variable for randomness

    // Constructor to initialize the deck
    public ThirdteenTwo() {
        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = randomInt(0, i); // Choose a random index between 0 and i
            swapCards(i, j);        // Swap the cards at index i and j
        }
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    private static int randomInt(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    private void swapCards(int i, int j) {
        Card temp = cards.get(i);			//get set and add method available in Arraylist
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    // Method to display the deck
    public void displayDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        ThirdteenTwo deck = new ThirdteenTwo();

        System.out.println("Deck before shuffling:");
        deck.displayDeck();

        deck.shuffle();

        System.out.println("\nDeck after shuffling:");
        deck.displayDeck();
    }
}
