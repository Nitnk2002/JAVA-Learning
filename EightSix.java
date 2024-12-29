
import java.util.Arrays;

class EightSix{
	
	public static void main(String[] args){
		int[] a={2,4,5,6,7,8,2,45,5,6};
		//int a= Integer.parseInt(args);
		System.out.println(maxInRange(a,6,9));
	}
	
	public static int maxInRange(int[] a,int lowIndex,int highIndex){
		//int max=0;
		if(lowIndex==highIndex){
			return a[lowIndex];
	}
	else 
	{
			int maxOfRest = maxInRange(a, lowIndex, highIndex - 1);
            return Math.max(a[highIndex],maxOfRest);
	}
		
	}
	
}