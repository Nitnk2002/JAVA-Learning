class Time{
	public static void main(String[] args){
		
		//calculate and display number of remaining seconds since midnight 
		final int hours=24,
		minute=60,
		seconds=60;
		
	int tHour=18;
	int tMinute= 31;
	int tSeconds= 31;
	int rCalculate=(hours-tHour)*minute*seconds+(minute-tMinute)*seconds+(tSeconds-seconds);
	
	System.out.println("Time "+tHour+":"+tMinute+":"+tSeconds+" converted into remaining seconds in day complete");
	System.out.println(rCalculate);
		//calculate and display number of seconds since midnight 
	int calculate= (tHour)*minute*seconds+(tMinute)*seconds+(tSeconds);
		System.out.println("Time "+tHour+":"+tMinute+":"+tSeconds+" converted into seconds in day complete");
	System.out.println(calculate);
	final int totalSeconds=hours*minute*seconds;
	double percentage= (calculate*100)/totalSeconds;
	System.out.println("Percentage of time completed :"+percentage);
	
	}
}