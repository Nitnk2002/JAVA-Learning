
import java.util.Scanner;

class SevenFour{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("To Find prime in range");
		System.out.print("Enter range n only : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		System.out.println(i+" = "+sieve(i));
		}
	}
	public static boolean sieve (int n){
		boolean flag=true;
		if(n==1){
			flag=false;
		}
		for(int i=2;i<=n/2;i++){
		if(n%i==0){
			flag=false;
		}
		}
		return flag;
	}
}