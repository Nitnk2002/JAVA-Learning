
class EightSeven{
	
	public static void main(String[] args){
		
		//printString("Nitish");
		//printBackward("Nitish");
		System.out.println(printReverse("Nitish"));
		System.out.println(isPallindrome("Nitish"));
	}
	public static void printString(String s){
		if(first(s)==s.charAt(length(s)-1)){
			System.out.println(first(s));
		}else{
			printString(s.substring(0,length(s)-1));
			System.out.println(s.charAt(length(s)-1));
		}
	}
		public static void printBackward(String s){
		if(first(s)==s.charAt(length(s)-1)){
			System.out.println(first(s));
		}else{
			System.out.println(s.charAt(length(s)-1));
			printBackward(s.substring(0,length(s)-1));
			
		}
	}
		public static String printReverse(String s){
			
		if(s.length()<1){
			return s;
		}else{
			String reverse=s.substring(length(s)-1);
			return reverse+printReverse(s.substring(0,length(s)-1));
		}
		
	}
		public static boolean isPallindrome (String s){
			//boolean isPallindrome= false;
			if(s.equals(printReverse(s))){
				return true;
			}else{
				return false;
			}

		
	}
	public static char first(String s) {
		return s.charAt(0);
	}

	public static String rest(String s) {
		return s.substring(1);
	}

	public static String middle(String s) {
		return s.substring(1, s.length() - 1);
	}

	public static int length(String s) {
		return s.length();
	}
}