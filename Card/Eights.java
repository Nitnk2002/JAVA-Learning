
import java.util.Scanner;
public class Eights{
	private Player one;
	private Player two;
	private Hand drawPile;
	private Hand discardPile;
	private Scanner sc;
	
	public Eights(){
		Deck deck= new Deck("Deck");
		deck.shuffle();
		//deal cards to each player
		one= new Player("Allen");
		deck.deal(one.getHand(),5);
		two = new Player("Chris");
		deck.deal(two.getHand(),5);
		//turn one card face up
		discardPile= new Hand("Discards");
		deck.deal(discardPile,1);
		//put the rest of the deck face down 
		drawPile = new Hand("Draw Pile");
		deck.dealAll(drawPile);
		//create the scanner we' ll use to wait for the user;
		sc= new Scanner(System.in);
	}
	public boolean isDone(){
		return one.getHand().isEmpty() || two.getHand().isEmpty();
	}
	public void reShuffle() {
		Card prev= discardPile.popCard();
		discardPile.dealAll(drawPile);
		discardPile.addCard(prev);
		drawPile.shuffle();
	}
	public Card drawCard(){
		if(drawPile.isEmpty()){
			reShuffle();
		}
		return drawPile.popCard();
	}
	public Player nextPlayer(Player current){
		if(current==one){
			return two;
		}else{
			return one;
		}
	}
	public void displayState(){
		one.display();
		two.display();
		discardPile.display();
		System.out.println("Draw Pile : ");
		System.out.println(drawPile.size()+" cards");
		sc.nextLine();
	}
	public void takeTurn(Player player) {
		Card prev = discardPile.lastCard();
		Card next = player.play(this, prev);
		discardPile.addCard(next);
		System.out.println(player.getName() + " plays " + next);
		System.out.println();
	}
	public void playGame() {
		Player player = one;
		// keep playing until there's a winner
		while (!isDone()) {
		displayState();
		takeTurn(player);
		player = nextPlayer(player);
		}
		// display the final score
		one.displayScore();
		two.displayScore();
	}
	public static void main(String[] args){
		Eights game= new Eights();
		game.playGame();
	}
}