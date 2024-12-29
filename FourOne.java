import java.util.Scanner;

class FourOne{
	public static void datePrint (String day,int date,String month,int year ){
		System.out.println(day+", "+date+", "+month+" "+year);
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name of Day : ");
		String day=sc.nextLine();
		System.out.println("Enter Date : ");
		int date=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name of Month : ");
		String month= sc.nextLine();
		System.out.println("Enter Year : ");
		int year= sc.nextInt();
		datePrint(day,date,month,year);
	}
}