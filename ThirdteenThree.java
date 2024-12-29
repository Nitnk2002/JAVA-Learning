
import java.util.Arrays;
class ThirdteenThree{
	
	private Deck deck;
	ThirdteenThree(){
		this.deck= new Deck();
	}
	
	private int indexLowest (int lowest, int highest){
		Card[] cards= deck.getCard();
		//deck.shuffle();
		int lowestIndex= lowest;
		for(int i=lowest+1;i<highest;i++){
		if(cards[i].compareTo(cards[lowestIndex])<0){
			lowestIndex=i;
		}
		}
		return lowestIndex;
	}
	public void selectionSort(){
		this.deck.shuffle();
		//System.out.println("when shuffle");
		//this.deck.print();
		Card[] cards= deck.getCard();
		for(int i=0;i<cards.length-1;i++){
			int j=indexLowest(i,cards.length);
			deck.swapCards(i,j);
		}
		//System.out.println("after arranging shuffle");
		this.deck.print();
	}
	
	public void print(){
		this.deck.print();
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
		ThirdteenThree findLowest= new ThirdteenThree();
		
		//System.out.println(findLowest.indexLowest(10,51));
		//findLowest.selectionSort();
		//findLowest.print();
		
	Deck deck = new Deck();
    deck.shuffle();
    int mid = deck.getCard().length / 2;

    Deck left = deck.subDeck(0, mid);
    Deck right = deck.subDeck(mid, deck.getCard().length);

    // Sort the subdecks
    findLowest.deck = left;
    findLowest.selectionSort();
    left = findLowest.deck;

    findLowest.deck = right;
    findLowest.selectionSort();
    right = findLowest.deck;

    // Merge the sorted subdecks
    deck = findLowest.mergeSort(left, right);

    // Print decks
    System.out.println("Sorted Left Deck:");
    left.print();

    System.out.println("\nSorted Right Deck:");
    right.print();

    System.out.println("\nMerged Deck:");
    deck.print();
	}
}