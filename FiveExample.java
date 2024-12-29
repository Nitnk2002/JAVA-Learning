import java.util.Scanner;

class FiveExample{
	//logrithm  value
	public static void main(String[] args){
		//prompt for user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		//checking wrong input 
		if(!sc.hasNextDouble()){
			String word=sc.next();
			System.err.println(word+" is not a number");
			return;
		}
		//check the range
		double num= sc.nextDouble();
		if(num>0){
			double cal= Math.log(num);
			System.out.printf("The log is %.3f ",cal);
		}else{
			System.out.println("The log is Undefined.");
		}
		
	}
}