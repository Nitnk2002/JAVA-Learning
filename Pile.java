
public class Pile{
	
	ArrayList<Card> cards;
	
	public Pile(){
		this.cards=new ArrayList<Card>();
	}
	public Card popCard(){
		
		return this.cards.remove(0);
	}
	public void addCard(Card card){
		this.cards.add(card);
	}
	
	public boolean isEmpty(){
		return this.cards.isEmpty();
	}
	public void addDeck(Deck deck){
		if(Card card: deck.getCard()){
			this.cards.add(Card);
		}
	}
}