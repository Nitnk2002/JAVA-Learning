

class TwelveTwo{
	private final int rank;
	private final int suit;
	
	public static final String[] RANKS= {null,"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	public static final String[] SUITS=  {"Clubs","Diamonds","Hearts","Spades"};
		
	public TwelveTwo(int rank, int suit){
		this.rank=rank;
		this.suit= suit;
	}
	public String toString(){
		return RANKS[this.rank]+" of "+SUITS[this.suit];
	}
		public int compareTo(TwelveTwo that){
			
		if(this.suit< that.suit){
			return -1;
		}
		if(this.suit> that.suit){
			return 1;
		}
		if (this.rank == 1 && that.rank != 1) {
            return 1; // Ace is always higher
        }
        if (that.rank == 1 && this.rank != 1) {
            return -1; // Other ranks are lower than Ace
        }
		return 0;
	}
	public static void main(String[] args){
		
		TwelveTwo card1= new TwelveTwo(13,0);
		TwelveTwo card2= new TwelveTwo(1,0);
		System.out.println(card1.compareTo(card2));
		System.out.println(card2.compareTo(card1));
	}
}