package com.dailybyte;

import java.util.HashMap;

public class SpotTheDifference {

	public static char spotTheDifference(String word1, String word2) {
		if(word1 == null || word2 == null) return Character.MIN_VALUE;
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		
		for(Character c : word1.toCharArray())
		{
			hMap.put(c, hMap.getOrDefault(c, 0) + 1);
		}
		
		for(Character c : word2.toCharArray()) {
			if(hMap.containsKey(c) && hMap.get(c) == 0 || !hMap.containsKey(c))
				return c;
			else
				hMap.put(c, hMap.get(c)-1);
		}
		return Character.MIN_VALUE;
	}
	
	public static void main(String[] args) {
		System.out.println(spotTheDifference("abcde", "abcdef"));   //return f
		System.out.println(spotTheDifference("abc", "aabc"));   //return f
	}
}
