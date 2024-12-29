import java.util.Scanner;

class SixFive{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("String to check abcededarian \nEnter String : ");
		String value=sc.nextLine();
		System.out.println(value+" is "+isDoubloon(toConvertLowerCase(value)));
	}
	public static boolean isDoubloon(String value){
		boolean f=false;
		for(int i=0;i<value.length();i++){
			for(int j=i+1;j<value.length();i++){
			if(value.charAt(i)==value.charAt(j)){
				f=true;
				break;
			}
			}
		}
		return f;
	}
		public static String toConvertLowerCase (String value){
		String result=value.substring(1);
		char v=value.charAt(0);
		for(int i=65;i<91;i++){
			if(i==value.charAt(0)){	
				v=(char)(i+32);
			}
		}
		return String.format("%s%s",v,result);
		}
}