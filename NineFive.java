
import java.util.Scanner;
import java.util.Arrays;
class NineFive {
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double[] a={1,2,3,4,5,6,7,8};
		///System.out.println("Enter power n: ");
		//int n = sc.nextInt();
		//double[] result=powArray(a,n);
		//for(int i=0;i<a.length;i++){
		//System.out.println(result[i]);
		//}
		
		int[] a={3,4,56,34,42,23,45,67,89,90,98,96,93,77,88,99,44,55,66,22,11};
		int ncounter=10;
		int[] hist= histogram(a,ncounter);
		System.out.println("Histogram : "+Arrays.toString(hist));
	}
	
	public static double[] powArray(double[] a, int n){

		double[] result= new double[a.length];
		
		for(int i=0;i<a.length;i++){
			double pow=1;
			for(int j=1;j<=n;j++){
				pow=pow*a[i];
			}
			result[i]=pow;
		}
		return result;
	}
	
	public static int[] histogram (int[] a, int counter){
		
	}
}