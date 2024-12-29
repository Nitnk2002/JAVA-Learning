
import java.util.Arrays;
class Search{
	
	public static Card[] makeDeck(Card[] cards){
	
		int index= 0;
		for(int suit=0;suit<=3; suit++){
			for(int rank=1; rank<=13;rank++){
				cards[index]= new Card(rank,suit);
				index++;
			}
		}
		return cards;
	}
	public static void printDeck(Card[] cards){
			System.out.println(Arrays.toString(cards));
	}
	
	public static int search(Card[] cards, Card target){
		for(int i=0;i<cards.length-1; i++){
			if(cards[i].equals(target)){
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(Card[] cards, Card target){
		int low=0;
		int high= cards.length-1;
		while(low<=high){
			int mid= (low+high)/2;
			int comp= cards[mid].compareTo(target);
			if(comp==0){
				return mid;
			}else if(comp<0){
				low=mid+1;
			}else if(comp>0){
				high= mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		Card[] cards = new Card[52];
		makeDeck(cards);
		Card card = new Card(15,0);
		System.out.println(binarySearch(cards,card));
		printDeck(cards);
	}
}