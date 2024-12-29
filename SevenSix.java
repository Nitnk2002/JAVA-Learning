
import java.util.Scanner;

class SevenSix {
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("to check prime factor and multiply of each element in array is equal to Integer ");
		System.out.println("Enter an Integer : ");
		int n= sc.nextInt();
		System.out.println("Enter an Array size : ");
		int size=sc.nextInt();
		int[] a= new int[size];
		for(int i=0;i<size;i++){
			System.out.println(i+1+" element : ");
			 a[i]=sc.nextInt();
		}
		System.out.println(arePrimeFactor(n,a));
	}
	public static boolean arePrimeFactor (int n, int[] a){
		boolean flag=false;
		int product=1;
		int count=0;
		for(int i=0;i<a.length;i++){
			if(arePrime(a[i])){
				count++;
			}
			product *= a[i];
		}
		if(count==a.length && product==n){
			flag=true;
		}
		return flag;
	}
		public static boolean arePrime (int n){
		boolean flag=true;
		if(n==1){
			flag=false;
		}
		for(int i=2;i<=n/2;i++){
		if(n%i==0){
			flag=false;
		}
		}
		return flag;
	}
}