package com.dailybyte;

public class ValidPalindromeWithRemoval {
	public static boolean validatePalindromeWithRemoval(String input) {
		
		if(input.contentEquals("") || input == null) return false;
		
		int i = 0;
		int j = input.length() - 1;
		
		while(i < j) {
			if(input.charAt(i) != input.charAt(j)) {
				return validatePalindrome(input, i+1, j) || validatePalindrome(input, i, j-1);
			}
			i += 1;
			j -= 1;
		}
		return true;
	}

	private static boolean validatePalindrome(String input, int i, int j) {
		while(i < j) {
			if(input.charAt(i) != input.charAt(j))
				return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(validatePalindromeWithRemoval("abcbcba"));//True; 'b' can be removed
		System.out.println(validatePalindromeWithRemoval("abba"));	 //True; Already a palindome
		System.out.println(validatePalindromeWithRemoval("abcda"));	 // False; 2 removals needed
	}
}
