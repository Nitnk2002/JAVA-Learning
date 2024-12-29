
class War{
	
	public static void main(String[] args){
		Deck deck= new Deck();
		deck.shuffle();
		
		Pile p1= new Pile();
		p1.addDeck(deck.subDeck(0,25));
		Pile p2 = new Pile();
		p2.addDeck(deck.subDeck(26,27));
		
		while(!p1.isEmpty() && !p2.isEmpty()){
			
			Card c1= p1.popCard();
			Card c2= p2.popCard();
			
			int diff= c1.getRank()-c2.getRank();
			if(diff>0){
				p1.popCard(c1);
				p2.popCard(c2);
			}else if(diff<0){
				p1.popCard(c1);
				p2.popCard(c2);
			}else{
				
			}
		}
		if(p1.isEmpty()){
			System.out.println("Player 2 is Winner");
		}else{
			System.out.println("Player 1 is Winner");
		}
	}
}