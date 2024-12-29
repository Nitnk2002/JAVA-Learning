import java.util.Scanner;

class SixSix{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("In Scrabble each player has a set of tiles with letters on them ");
		System.out.println("Imagine you are given your set of tiles as a string, like \"quijibo\",");
		System.out.println("and you are given another string to test, like \"jib\".");
		System.out.println("Enter Scrabble word: ");
		String scrabbleWord=sc.nextLine();
		System.out.println("Enter word to find : ");
		String wordFind= sc.nextLine();
		System.out.println(scrabbleGame(scrabbleWord.toLowerCase(),wordFind.toLowerCase()));
	}
	
	public static boolean scrabbleGame (String scrabbleWord,String wordFind){
		
		Boolean result=false;
		for(int i=0;i<scrabbleWord.length() - wordFind.length();i++){
			String subWord= scrabbleWord.substring(i,wordFind.length()+i);
			
			if(subWord.equals(wordFind)){
				System.out.println(subWord);
				result= true;
			}
			
		}
		return result;
		
	}
		

	}
