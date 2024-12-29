
class ThirdteenFour{
	public Card[] cards;
	public void insertionSort(){
			Deck deck= new Deck();
			deck.shuffle();
		for(int i=1;i<deck.getCard().length;i++){

			Card[] current= deck.getCard();
			int j=i-1;
			while(j>=0 && deck.cards[j].compareTo(current[i])>0){
				deck.cards[j+1]=deck.cards[j];
				j--;
			}
			deck.cards[j+1]=current[i];
		}
		deck.print();
		
	}
	public static void main(String[] args){
		ThirdteenFour sort= new ThirdteenFour();
		sort.insertionSort();
		//Deck deck = new Deck();
		//deck.print();
	}
}