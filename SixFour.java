import java.util.Scanner;

class SixFour{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("String to check abcededarian \nEnter String : ");
		String value=sc.nextLine();
		System.out.println(value+" is "+isAbcededarian(value));
	}
	public static boolean isAbcededarian (String value){
		boolean f=false;
		int j=0;
		for(int i='a';i<'z';i++){
			if(i==value.charAt(j)){
				j++;
			}
			if(j==value.length()){
				f=true;
				break;
			}
		}
		return f;
	}
}