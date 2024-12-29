import java.util.Scanner;

class EightOne{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter line of Lyrics : ");
		int n=sc.nextInt();
		songLyrics(n);
		
	}
	
	public static void songLyrics(int n){
		
		String line=" bottles of beer on the wall, ";
		if(n==0){
			System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
			
		}else{
			System.out.println(n+line+n+" bottles of beer, ya’ take one down,"+"ya’ pass it around,");
			System.out.println((n-1)+line);
			songLyrics(n-1);
		} 
	}
}