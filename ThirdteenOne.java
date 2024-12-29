
import java.lang.StringBuilder;
class ThirdteenOne{
	Card cards= new Card(1,2);
	public String toString(){
		StringBuilder text= new StringBuilder();
		String CardName= "Card["+cards.RANKS[cards.getRank()]+","+cards.SUITS[cards.getSuit()]+"]";
		return text.append(CardName).toString();
	}
	public static void main(String[] args){
		//Deck deck= new Deck();
		//deck.shuffle();
		ThirdteenOne t= new ThirdteenOne();
		System.out.println(t.toString());
	}
}