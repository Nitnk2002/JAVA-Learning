
import java.util.Scanner;

class NineFour {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("value of e^x  of n terms \nEnter  x : ");
		double x= sc.nextInt();
		System.out.println("Enter  n : ");
		double n= sc.nextInt();
		double result=myExp(x,n);
		//System.out.printf("%.2f\t",result);
		double result2=exceptionExp(x,n,1,1,0);
		//System.out.printf("%.2f\n",result2);
		//System.out.println(Math.exp(x));
		for(double i=0.1;i<101;i*=10){
		check(i,n+i*10);
		}
		for(double i=-0.1;i>-101;i*=10){
		check(i,n-i*10);
		}
	}
	public static void check(double x,double n){
		
		System.out.printf("%.1f\t%f\t%f\n",x,myExp(x,n),Math.exp(x));
	}
	public static double exceptionExp(double x, double n,double numerator,double denominator,int i){
		
		if(i>=n){
			return 0;
		}
		else{
			double currentTerm=numerator/denominator;

			return currentTerm+exceptionExp(x,n,numerator*x,denominator*(i+1),i+1);
		}
	}
	public static double myExp(double x, double n){
	if(n==0){
		return 1.0;
	}
	else{
		return myExp(x,n-1)+Math.pow(x,n)/factorial(n);
	}
	}
	
	public static double factorial(double n){
		
		if(n==0){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	
}