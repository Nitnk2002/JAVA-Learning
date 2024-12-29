
import java.util.Scanner;

class SevenFive {
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("to check integer divisible by  an array all element ");
		System.out.println("Enter an Integer : ");
		int n= sc.nextInt();
		System.out.println("Enter an Array size : ");
		int size=sc.nextInt();
		int[] a= new int[size];
		for(int i=0;i<size;i++){
			System.out.println(i+1+" element : ");
			 a[i]=sc.nextInt();
		}
		System.out.println(areFactor(n,a));
	}
	public static boolean areFactor (int n, int[] a){
		boolean flag=false;
		int count=0;
		for(int i=0;i<a.length;i++){
			if(n%a[i]==0){
				count++;
			}
		}
		if(count==a.length){
			flag=true;
		}
		return flag;
	}
}