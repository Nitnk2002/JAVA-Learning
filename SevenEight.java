

class SevenEight {
	
	public static void main(String[] args){

		anagrams(removeSpace("stop"),removeSpace("pots"));
		anagrams(removeSpace("allen downey"),removeSpace("well annoyed"));
		anagrams(removeSpace("christopher mayfield"),removeSpace("hi prof the camel is dry"));
	}
	public static void anagrams(String s1,String s2){
		//int count=0;
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				for(int j=0;j<s2.length();j++){
					if(s1.charAt(i)==s2.charAt(j)){
						s1=s1.replace(s1.substring(i,i+1),"");
						s2=s2.replace(s1.substring(j,j+1),"");
						i=0;
						j=0;
					}
				}
			}
			if(s2.length()==s1.length()){
				System.out.println(s1+" is anagram of "+s2);
			}else{
				System.out.println(s1+" is not anagram of "+s2);
			}
		}
		else{
			System.out.println(s1+" is not anagram of "+s2);
		}

	}
	
	public static String removeSpace(String s){
		
		String result = s.replaceAll("\\s", "");
		return result;
	}

}