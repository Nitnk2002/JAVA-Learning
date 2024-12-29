
import java.util.Scanner;

class ElevenFour{
	
	public static void main(String[] args){
		Rational r1= new Rational(4,12);
		r1.reduce();
		double result= r1.toDouble();
		System.out.println(result);
		r1.negate();
		r1.invert();
		r1.printRational();


	}
}

class Rational{
	
	private int numerator;
	private int denominator;
	
	public Rational(){
		this.numerator=0;
		this.denominator=1;
	}
	public Rational(int numerator, int denominator){
		
		this.numerator= numerator;
		this.denominator= denominator;
	}
	public void printRational(){
		if(denominator != 0  ){
		System.out.println("Rational number : "+numerator+"/"+ denominator);
		}else {
			System.out.println("Not Rational number");
		}
	}
	@Override
	public String toString(){
		 return "Rational number : "+numerator+"/"+ denominator;
	}
	public void negate(){
		numerator= numerator*(-1);
		
	}
	public void invert (){
		numerator= numerator+denominator;
		denominator= numerator-denominator;
		numerator= numerator-denominator;
	}
	public double toDouble(){
		double result = (double)numerator/denominator;
		return result;
	}
	public void reduce(){
		int gcdValue= gcd();
		int tempN= numerator/gcdValue;
		int tempD= denominator/gcdValue;
		System.out.println("Rational number : "+tempN+"/"+ tempD);
	}
	public int gcd(){
			int tempN= numerator;
			int tempD= denominator;
		while(tempD!=0){
			int calD=tempD;
			tempD= tempN%tempD;
			tempN= calD;
		}
		return tempN;
	}
}