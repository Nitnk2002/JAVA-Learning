
import java.util.Scanner;

class EightTwo{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter odd number :  ");
		int n=sc.nextInt();
		System.out.println(oddSum(n));
		
	}
	public static int oddSum(int n){
		if(n%2 ==0){
			System.err.println("Enter odd number not even number but Answer as per adding 1 in "+n);
			return oddSum(n+1);
		}
		int sum=0;
		if(n==1){
			//sum=sum+n;
			return n;
		}
		else{
			//System.out.println(n);
			sum=n+oddSum(n-2);
		}
		return sum;
	}
}