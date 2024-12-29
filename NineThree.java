import java.util.Scanner;
import java.math.BigInteger;
class NineThree {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("power of x^n\nEnter base x: ");
		int x= sc.nextInt();
		System.out.println("Enter power n: ");
		int n= sc.nextInt();
		BigInteger result= pow(x,n);
		System.out.println(result);
	}
	
	public static BigInteger pow(int x,int n){
		if(n==0) return BigInteger.ONE;
		BigInteger t= pow(x,n/2);
		//BigInteger base= BigInteger.valueOf(x);
		if(n%2==0){
			return t.multiply(t);
		}else{
			return t.multiply(t).multiply(BigInteger.valueOf(x));
		}
	}
}