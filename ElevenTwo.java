
class ElevenTwo{
	
	public static void main(String[] args){
		
		Tile tile= new Tile('Z',10);
		tile.printTile();
		
		System.out.println(tile);
		
		Tile tile2= new Tile('Z',10);
		System.out.println("tile equals : "+tile.equals(tile2));
		tile.setLetter('A');
		tile.setValue(1);
		System.out.println("updated : "+ tile);
		tile.getLetter();
		
		System.out.println(tile.getValue()+"|"+tile.getLetter());
	}
}

class Tile{
	
	private char letter;
	private int value ;
	
	public Tile(char letter,int value){
		this.letter= letter;
		this.value=value;
	}
	public void printTile(){
	System.out.println("Tile[letter : "+ letter+" , value: "+value+" ]");
	}
	
	@Override
	public String toString(){
		return "Tile[letter : "+ letter+" , value: "+value+" ]";
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj) return true;
		if(obj==null || getClass()!= obj.getClass()) return false;
		Tile tile=(Tile) obj;
		return letter== tile.letter && value== tile.value;
		
	}
	public char getLetter(){
		return letter;
	}
	public int getValue(){
		return value;
	}
	public void setLetter(char letter){
		this.letter= letter;
	}
	public void setValue(int value){
		this.value= value;
	}
}