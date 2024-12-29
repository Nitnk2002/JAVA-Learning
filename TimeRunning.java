import java.util.Scanner;

class TimeRunning{
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int seconds=0;
		System.out.print("Enter hours : ");
		int hours= sc.nextInt();
		System.out.print("Enter minutes : ");
		int minutes= sc.nextInt();
		timeStamp(hours,minutes,seconds);
	}
	public static void  timeStamp(int hours,int minutes,int seconds){
		//String time="",
				while(true){
		//	System.out.print();
		//	System.out.print();

			if(seconds==60){
				seconds=0;
				minutes++;
			}
			if(minutes==60){
				minutes=0;
				hours++;
			}
			if(hours==24){
				hours=0;
				minutes=0;
				seconds=0;
			}
			String time =String.format("%02d:%02d:%02d\r",hours,minutes,seconds);
			System.out.print(time);
			seconds++;
			try {
                Thread.sleep(1000);  // Pause for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
			
		}
	}
}