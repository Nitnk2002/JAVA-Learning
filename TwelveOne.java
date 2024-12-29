

class TwelveOne{
	private final int rank;
	private final int suit;
	
	public static final String[] RANKS= {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	public static final String[] SUITS=  {"Clubs","Diamonds","Hearts","Spades"};
		
	public Card(int rank, int suit){
		this.rank=rank;
		this.suit= suit;
	}
	public String toString(){
		return RANKS[this.rank]+" of "+SUITS[this.suit];
	}
		public int compareTo(Card that){
			
		if(this.suit< that.suit){
			return -1;
		}
		if(this.suit> that.suit){
			return 1;
		}
		if(RANKS[1]>RANKS[13]){
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
	public static void main(String[] args){
		
	}
}