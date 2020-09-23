package com.dailybyte;

public class ValidAnagram {
  
  //Time limit exceeding for really large strings
	public static boolean validateAnagram(String word1, String word2) {
		
		if(word1 == null || word1.equals("") || word2 == null || word2.equals("")) return false;
		
		if(word1.length() != word2.length()) return false;
		
		for(Character c : word1.toCharArray())
		{
			if(word2.indexOf(c) == -1) {
				return false;
			}
			else {
				//word2 = word2.replace(c, 'x');
				word2 = word2.replaceFirst(c.toString(), c.toString().toUpperCase());
			}
		}
		System.out.println(word2);
		return true;
	}
	
	public boolean validateAnagrams(String word1, String word2) {
		
        if(word1.length() != word2.length()) 
            return false;
		if(word1 == null || word2 == null)
            return false;
		if( word1.equals("") && word2.equals(""))
            return true;
		
		int[] counts = new int[26];
        
        for(int i = 0; i < word1.length(); i++){
            counts[word1.charAt(i)-'a']++;
            counts[word2.charAt(i)-'a']--;
        }
        
        for(int i : counts){
            if(i != 0)
                return false;
        }
        
        return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(validateAnagrams("cat", "tac")); //Return true
		System.out.println(validateAnagrams("listen", "silent")); //Return true
		System.out.println(validateAnagrams("", "ab")); //Return true
		
	}
}
