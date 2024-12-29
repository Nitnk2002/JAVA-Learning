import java.util.Scanner;

class FiveSix{
//to find roots of Quadratic equation
	public static void main(String[] args){
	
	System.out.println("To find roots of ax^2+bx+c the input ");
	Scanner sc= new Scanner(System.in); 
	System.out.print("Enter a : ");
	double a= checkInput(sc);
	if(a==0){
		System.err.println("a not will be zero .");
		a= checkInput(sc);
	}
	System.out.print("Enter b : ");
	double b= checkInput(sc);
	System.out.print("Enter c : ");
	double c= checkInput(sc);
	roots(a,b,c);

	
	}
	public static double checkInput(Scanner sc){
		double value=0.0;
		if(sc.hasNextDouble()){
			value= sc.nextDouble();
		}else{
			String word=sc.next();
			System.err.println(word+" is not a number Enter again");
			checkInput(sc);
		}
		return value;
	}
	public static void roots(double a,double b,double c){
		
		double d=b*b-4*a*c;
		if(d<0){
			System.out.println("It have complex root ");
		}else{
			double sqrtD=Math.sqrt(d);
			double root_1= (sqrtD-b)/(2*a);
			double root_2= ((-sqrtD)-b)/(2*a);
			System.out.printf("( %.2f, %.2f)",root_1,root_2);
		}
	}
}