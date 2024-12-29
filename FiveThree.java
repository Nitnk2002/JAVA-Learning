import java.util.Scanner;

class FiveThree{
	//fermat last theorem that there are no integers a, b, c, and n such that
 //a^n + b^n = c^n, except when n ≤ 2.
	public static void main(String[] args){
		boolean flag= false;
		System.out.println("For checking Fermat's Last Theorem\n Enter a,b,c,n and here n is power.");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter  a : ");
		int a= sc.nextInt();
		System.out.print("Enter  b : ");
		int b= sc.nextInt();
		System.out.print("Enter  c : ");
		int c= sc.nextInt();
		System.out.print("Enter  n : ");
		int n= sc.nextInt();
		flag=checkFermatTheorem(a,b,c,n);
		if(n>2 && flag){
			System.out.println("Holy smokes, Fermat was wrong!");
		}else{
			System.out.println(flag);
			System.out.println("No, that doesn’t work.");
		}
		
	}
	public static boolean checkFermatTheorem (int a,int b,int c, int n){
		double rhs= Math.pow(a,n)+Math.pow(b,n);
		double lhs= Math.pow(c,n);
		if(rhs==lhs){
			return true;
		}
		else
		{
			return false;
		}
	}
}