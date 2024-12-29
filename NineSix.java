
import java.util.Scanner;

class NineSix{
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		//String s = "((3 + 7) * 2)";
		System.out.println("is balanced : "+checkParenthesis(s));
	}
	
	public static boolean checkParenthesis (String s){
		
		int count = 0;
		int curly=0;
		int square=0;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (c == '(') count++;
		else if (c == '{') curly++;
		else if (c == '[') square++;
		else if (c == ')') {
			if(count==0) return false;
			count--;
		}
		else if (c == '}'){
		if(curly==0) return false;
		curly--;
		}
		else if (c == ']'){
			if(square==0) return false;
		 square--;
		}
	}
		return count==0 && curly==0 && square==0;
	}
	
    public static boolean checkParenthesisCorrect (String s) {
        // Keep replacing valid pairs until no changes occur
        String previous;
        do {
            previous = s;
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (!s.equals(previous));

        // If the string is empty, all brackets were balanced
        return s.isEmpty();
    }

}