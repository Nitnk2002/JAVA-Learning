
import java.util.Arrays;

class max{
	
	public static void main(String[] args){
		if(args.length==0){
			System.err.println("Usage: java max <numbers> ");
			return;
		}
		
		int max= Integer.MIN_VALUE;
		for(String arg: args){
			int value= Integer.parseInt(arg);
			if(value>max){
				max= value;
			}
		}
		System.out.println("max : "+max);
	}
}