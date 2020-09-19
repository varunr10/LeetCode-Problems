package com.dailybyte;

public class CorrectCapitalization {
	
	public static boolean checkCapitalization(String input){
	
		if(input.equals("") || input == null) return false;
		
		int numberOfCapitalLetters = 0;
		int i = 0;
		boolean firstCaps = false;
		for(Character c : input.toCharArray()) {
			
			if(!c.equals(Character.toLowerCase(c))&& i == 0) {
				firstCaps = true;
				numberOfCapitalLetters += 1;
			}
			else if(!c.equals(Character.toLowerCase(c))) {
				numberOfCapitalLetters += 1;
			}				
			i += 1;
		}
		
		if(numberOfCapitalLetters == input.length())
			return true;
		
		if(numberOfCapitalLetters == 1 && firstCaps)
			return true;
		if(numberOfCapitalLetters == 0)
			return true;
		
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkCapitalization("USA")); 	 //True
		System.out.println(checkCapitalization("Calvin"));   //True
		System.out.println(checkCapitalization("compuTer")); //False
		System.out.println(checkCapitalization("coding"));	 //True
		System.out.println(checkCapitalization("Varun"));	 //False
	}
}
