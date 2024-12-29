
import java.util.Scanner;
class EightFive{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter base x: ");
		double x=sc.nextDouble();
		System.out.println("Enter power n: ");
		int n=sc.nextInt();
		System.out.println(power(x,n));
	}
	
	public static double power(double x, int n){
		
		if(n==0){
			return 1;
		}else{
			return x*power(x,n-1);
		}
	}
}