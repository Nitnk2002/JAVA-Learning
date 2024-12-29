import java.util.Scanner;

class ThreeTwo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a temperature in celcius : ");
		double cel=sc.nextDouble();
		double fahren=(cel*(9.0/5.0))+32.0;
		System.out.printf("%.1f C = %.1f F",cel,fahren);
	}
}