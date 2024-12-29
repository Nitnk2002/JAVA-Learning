
import java.util.Scanner;
import java.math.BigInteger;
class NineTwo {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Factorial\nEnter a number  : ");
		int n= sc.nextInt();
		
		for(int j=1;j<=n;j++){
		System.out.println("Factorial of "+j+" = "+factorial(j));
		}
	}
	
	public static BigInteger factorial(int n){
		
		if(BigInteger.ONE.equals(BigInteger.valueOf(n))){
			return BigInteger.ONE;
		}
		else{
			return BigInteger.valueOf(n).multiply(factorial(n-1));
		}
	}
	
}