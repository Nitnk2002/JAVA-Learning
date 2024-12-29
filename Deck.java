
import java.util.Random;
import java.util.Arrays;
public class Deck {
	
	public Card[] cards;
	
	Deck(int n){
		this.cards= new Card[n];
	}
	public Deck(){
		this.cards= new Card[52];
		int index=0;
		for(int suit=0;suit<4;suit++){
			for(int rank=1;rank<14;rank++){
				this.cards[index]= new Card(rank,suit);
				index++;
			}
		}
	}
	Deck(Card[] cards){
		this.cards= cards;
	}
	public Card[] getCard(){
		return this.cards;
	}
	public void print(){
		for(Card card: this.cards){
			System.out.println(card.toString());
		}
	}
	public void shuffle(){
		
		//for each index i{
			for (int i = cards.length - 1; i > 0; i--) {
            int j = randomInt(0, i); // Choose a random index between 0 and i
            swapCards(i, j);        // Swap the cards at index i and j
        }
		//}
	}
	private int randomInt(int low, int high) {
		Random random = new Random();
		return random.nextInt(high - low + 1) + low;
	// return a random number between low and high,
	// including both
	}
	public void swapCards(int i, int j) {
		Card temp = cards[i];			//get set and add method available in Arraylist
			cards[i]=cards[j];
			cards[j]=temp;

	// swap the ith and the jth cards in the array
	}
	public void selectionSort() {
	//for each index i {
	// find the lowest card at or to the right of i
	// swap the ith card and the lowest card found
	//}
	}
	private int indexLowest(int low, int high) {
		return 0;
	// find the lowest card between low and high
	}
		public Deck subDeck(int low,int high){
		return new Deck(Arrays.copyOfRange(cards, low, high));
	}
		public Deck mergeSort(Deck left,Deck right){
	Card[] leftCards= left.getCard();
	Card[] rightCards= right.getCard();
		Card[]  mergedCards= new Card[leftCards.length+rightCards.length];
		int i=0,j=0,k=0;
		
		while(i<leftCards.length && j<rightCards.length){
			
			if((leftCards[i].compareTo(rightCards[j]))<=0){
				mergedCards[k++]=leftCards[i++];
			}else{
			mergedCards[k++]= rightCards[j++];
			}
		}
		while(i<left.cards.length){
		mergedCards[k++]= leftCards[i++];
		}
		while(j<right.cards.length){
			mergedCards[k++]= rightCards[j++];
		}
		return new Deck(mergedCards);
	}
	public static void main(String[] args){
		
		Deck deck= new Deck();
		deck.print();
		deck.shuffle();
		 System.out.println("\nDeck after shuffling:");
		deck.print();
	}
	

}