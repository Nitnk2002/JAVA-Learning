//include ThreeFour.java  and edit 
import java.util.Scanner;
import java.util.Random;

class FiveTwo{
	
	public static void main(String[] args){
		
		System.out.println("I'm thinking a number between 1 and 100 (including both ) \n can you guess what it is ?");
		guessNumber(0);
		
	}
	public static void guessNumber(int flag){

		if(flag==3){
			System.out.println("You've reached the maximum number of attempts. Game over!");
			return;
		}else{
			flag++;
		Random random= new Random();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number : ");
		//checking the input is not string
		if(!sc.hasNextInt()){
			String word=sc.next();
			System.err.println(word+" is not a number.");
			guessNumber(flag-1);
		}
		int number= sc.nextInt();
		if(number>0 &&number<=100){
		int guess= random.nextInt(100)+1;
		System.out.println("Your guess number is "+number);
			//System.out.println(flag);
		if(guess==number)
		{
		System.out.println("Matched with My guess "+guess);
			return;
		}
		else
		{
		System.out.print("Difference is ");
		if(number>guess)
		{
			System.out.println(number-guess);
		}
		else
		{
			System.out.println(guess-number);
		}
		System.out.println("Not Matched with My guess("+guess+")" );
		guessNumber(flag);
		}
		}
		else
		{
			System.err.println("Enter number b/w 1 and 100.");
			guessNumber(flag-1);
		}
		}
	}
}