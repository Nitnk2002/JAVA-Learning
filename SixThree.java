
import java.util.Scanner;

class SixThree{
	
	public static void main(String[] args){
		
		System.out.println("exp(-x^2)= 1-x^2+x^4/2-x^6/6....");
		Scanner sc= new Scanner(System.in);
		//value of x
		System.out.print("Enter value of x : ");
		int x=sc.nextInt();
		System.out.print("Enter nth term : ");
		int n=sc.nextInt();
		double result= gauss(x,n);
		System.out.println(result);
	}
	public static double gauss(int x,int n){
		double sum=0.0;
		for(int i=0;i<n;i++){
			double expNegXSquare=(power(-1,i)*power(x,2*i))/factorial(i);
			sum=sum+expNegXSquare;
		}
		return sum;
	}
	public static int factorial (int num){
		int f=1;
		if(num==0){
			f=1;
		}else{
		for(int i=1;i<=num;i++){
			f=f*i;
		}
		}
		return f;
	}
	public static int power(int x,int n){
		int powAns=1;
		if(n==0){
			powAns=1;
		}else{
		for(int i=1;i<=n;i++){
			powAns=powAns*x;
		}
		}
		return powAns;
	}
}