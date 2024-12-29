import java.util.Scanner;

class SixTwo{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("To find Square root of any number ");
		System.out.println("Enter a number : ");
		double n= checkInput(sc);
		double x=squareRoot(n);
		System.out.printf("%.3f\n",x);
		System.out.println(Math.sqrt(n));
	}
	public static double squareRoot(double n){
		double x=0.0,a=(n/2);
		for(int i=0; i<a;i++){
			x=(a+n/a)/2;
			//System.out.println(x);
			double result = a-x;
			if(Math.abs(result)<0.0001){
				break;
			}
			a=x;
		}
		return x;
	}
	public static double checkInput(Scanner sc){
		double n=0;
		if(!sc.hasNextDouble()){
			String word=sc.next();
			System.out.println(word+" is not a number");
		}else{
			 n= sc.nextDouble();
		}
		return n;
	}
}