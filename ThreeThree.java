import java.util.Scanner;
// converting second to hours minute and second
class ThreeThree{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter in Seconds : ");
		int secInput = sc.nextInt();
		int hours= secInput/3600;
		int remHours=secInput%3600;
		int minute= remHours/60;
		int seconds= remHours%60;
		System.out.println(hours+"hours,"+minute+"minutes,"+seconds+"seconds");
	}
}