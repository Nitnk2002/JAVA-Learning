import java.util.Scanner;

class FiveSeven{
	//check to form a triangle by its side
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("To by side lenth triangle will form or not.");
		System.out.println("Enter 1st side : ");
		int a=checkInput(sc);
		System.out.println("Enter 2nd side : ");
		int b=checkInput(sc);
		System.out.println("Enter 3rd side : ");
		int c=checkInput(sc);
		checkTriangle(a,b,c);
	}
	public static void checkTriangle(int a,int b,int c){
		boolean case_1= (a+b) > c;
		boolean case_2= (a+c) > b;
		boolean case_3= (b+c) > a;
		
		if(case_1 && case_2 && case_3){
			System.out.println("Combination form a triangle.");
		}else{
			System.out.println("Combination not form a triangle.");
		}
		
	}
	public static int checkInput (Scanner sc){
		int value=0;
		if(!sc.hasNextInt()){
			String word=sc.next();
			System.out.println(word+"is not a number");
			checkInput(sc);
		}else{
			value= sc.nextInt();
		}
		return value;
	}
}