class FiveFour{
	
	public static void main(String[] args){
		
	boolean yes = true;
	boolean no = false;
	int loVal = -999;
	int hiVal = 999;
	double grade = 87.5;
	double amount = 50.0;
	String hello = "world";
	System.out.println(yes == no || grade > amount);
	//System.out.println(amount == 40.0 || 50.0);
	System.out.println(hiVal != loVal || loVal < 0);
	//System.out.println(True || hello.length() > 0);
	System.out.println(hello.isEmpty() && yes);
	System.out.println(grade <= 100 && !false);
	System.out.println(!yes || no);
	//System.out.println(grade > 75 > amount);
	System.out.println(amount <= hiVal && amount >= loVal);
	System.out.println(no && !no || yes && !yes);
	}
}