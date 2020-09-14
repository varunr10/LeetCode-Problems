package com.dailybyte;

import java.util.Stack;

public class ValidPalindrome {
	
	public static boolean validatePalindrome(String input) {
		
		if(input == "" || input == null) return false;
		
		Stack<Character> stack = new Stack<Character>();
		StringBuilder output = new StringBuilder();
		
		for(char c : input.toCharArray()) {
			stack.push(c);
		}
		
		int i = 0;
		int length = stack.size();
		while(i < length) {
			output.append(stack.pop());
			i += 1;
		}
		
		if(input.equals(output.toString()))
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(validatePalindrome("level"));
		System.out.println(validatePalindrome("algorithm"));
		//System.out.println(validatePalindrome("A man, a plan, a canal: Panama."));   //Need to add Regex to eliminate spaces and special characters.
	}
}
