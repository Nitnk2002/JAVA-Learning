import java.util.Arrays;

class Card {
    int rank;
    int suit;
	public static final String[] RANKS= {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	public static final String[] SUITS=  {"Clubs","Diamonds","Hearts","Spades"};
    // Constructor
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" + "rank=" + RANKS[this.rank] + ", suit=" + SUITS[this.suit] + '}';
    }
	public int compareTo(Card that){
		if(this.suit< that.suit){
			return -1;
		}
		if(this.suit> that.suit){
			return 1;
		}
		if(this.rank< that.rank){
			return -1;
		}
		if(this.rank>that.rank){
			return 1;
		}
		return 0;
	}
}

class TwelveThree {

    // Method to calculate suit histogram
    public static int[] suitHist(Card[] cards) {
        int[] histogram = new int[5]; // Assuming 4 suits: 0-3
        for (Card card : cards) {
			if(card!=null){
            histogram[card.suit]++;
			}
        }
        return histogram;
    }
	public static boolean hasFlush(Card[] cards){
	        int[] histogram = suitHist(cards);
        for (int count : histogram) {
            if (count >= 5) { // Flush condition
                return true;
            }
        }
        return false;
	}

    public static void main(String[] args) {
        Card[] cards = new Card[5];
        int i = 0;

        // Populate the cards array
        for (int suit = 0; suit < 1; suit++) {
            for (int rank = 3; rank < 8; rank++) { // Only one rank is being added
                if (i < cards.length) { // Prevent index out of bounds
                    cards[i] = new Card(rank, suit);
                    i++;
                }
			if(i==5){
				break;
			}
            }

        }

        // Print the histogram of suits
        int[] histogram = suitHist(cards);
        System.out.println("Suit Histogram: " + Arrays.toString(histogram));

        // Print the cards
        System.out.println("Cards: " + Arrays.toString(cards));
		System.out.println(hasFlush(cards));
    }
}
