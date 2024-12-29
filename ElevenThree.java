

class ElevenThree{
	
	public static void main(String[] args){
		
		Date bdate = new Date(2004,"may",29);
		
		bdate.printDate();
		//Date bdate2= new Date();
		bdate.setDay(29);
		bdate.setYear(2003);
		bdate.setMonth("March");
		bdate.printDate();
		
	}
}

class Date{
	private int year;
	private String month;
	private int day;
	
	public Date(){
		System.out.println("20"+" November "+"2024");
	}
	public Date(int year, String month,int day){
		this.year= year;
		this.month= month;
		this.day= day;
	}
	
	public void printDate(){
		System.out.println(day+" "+month+" "+year);
	}
	
	public int getYear(){
		return year;
	}
	public String getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	
	public void setYear(int year){
		this.year= year;
	}
	public void setMonth(String month){
		this.month= month;
	}
	public void setDay(int day){
		this.day= day;
	}
}