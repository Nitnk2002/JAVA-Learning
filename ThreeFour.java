import java.util.Scanner;
import java.util.Random;

class ThreeFour{
	
	public static void main(String[] args){
		System.out.println("I'm thinking a number between 1 and 100 (including both ) \n can you guess what it is ?");
		Random random= new Random();
		Scanner sc= new Scanner(System.in);
		int number= sc.nextInt();
		int guess= random.nextInt(100)+1;
		System.out.println("Your guess number is "+number);
		//boolean match= (boolean)number && (boolean)guess;//cannot convert to boolean
		//System.out.println(match);
		System.out.println("Number guess by me is "+guess );
		
	}
}