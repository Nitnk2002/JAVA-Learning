class FourSix{
	
	public static void main(String[] args){
		double a=1.0;
		double b=2.0;
		double c=3.0;
		System.out.println(multAdd(a,b,c));
		System.out.printf("%.3f\n",multAdd(a,Math.sin(Math.PI/(a+c)),Math.cos(Math.PI/(a+c))/b));
		System.out.printf("%.3f\n",multAdd(a,Math.log(10),Math.log(20)));
		System.out.printf("%.3f\n",expSum(a));
		
	}
	public static double multAdd(double a,double b,double c){
		return a*b+c;
	}
	public static double expSum(double x){
		return multAdd(x,1/Math.exp(x),Math.sqrt(1-(1/Math.exp(x))));
	}
}