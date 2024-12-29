
import java.util.ArrayList;
import java.util.Random;

public class CardCollection{

		private String label;
		protected ArrayList<Card> cards;
		
		CardCollection(String label){
			this.label=label;
			this.cards= new ArrayList<Card>();
		}
		public void addCard(Card card){
			this.cards.add(card);
		}
		public Card popCard(){
			int i=cards.size()-1;
			return this.cards.remove(i);
		}
		public boolean isEmpty(){
			return this.cards.isEmpty();
		}
		public Card getCard(int i){
			return this.cards.get(i);
		}
		public String getLabel(){
			return this.label;
		}
		public Card lastCard(){
			int i=cards.size()-1;
			return cards.get(i);
		}
		public int size(){
			return this.cards.size();
		}
		protected int randomInt(int low, int high) {
		Random random = new Random();
		return random.nextInt(high - low + 1) + low;
	}
		public static void main(String[] args){
			Deck deck = new Deck("Deck");
			deck.shuffle();
			Hand hand= new Hand("Hand");
			deck.deal(hand,5);
			hand.display();
			
			Hand drawPile= new Hand("Draw Pile");
			deck.dealAll(drawPile);
			System.out.print("Draw Pile has %d cards. \n",drawPile.size());
		}
}