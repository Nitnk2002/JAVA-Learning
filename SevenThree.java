

class SevenThree{
	
	public static void main(String[] args){
		
		int[] a={2,3,6,7,0,3,9,12,8};
		System.out.println(indexOfMax(a));
	}
	public static int indexOfMax (int[] a){
		int max=0;
		for(int i=0;i<a.length-1;i++){
			if(i!=a.length){
				if(a[i]>a[i+1]){
				max= a[i];
			}
			}
		}
		
		return max;
	}
}