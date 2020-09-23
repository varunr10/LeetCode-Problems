package com.dailybyte;

import java.util.HashSet;

public class JewelsAndStones {
	
	public static int findCountOfMyJewels(String jewels, String stones) {
		
		if(jewels.contentEquals("") || jewels == null || stones.equals("") || stones == null)
			return 0;

		HashSet<Character> hSet = new HashSet<Character>();
		int countOfMyJewels = 0;
		
		//Add all Jewel characters in Hashset
		for(Character c : jewels.toCharArray()) {
			hSet.add(c);
		}
		
		//Loop through Stones characters to find the count
		for(Character c : stones.toCharArray()) {
			if(hSet.contains(c)) {
				countOfMyJewels += 1;
			}
		}
		
		return countOfMyJewels;
	}
	
	public static void main(String[] args) {
		System.out.println(findCountOfMyJewels("abc", "ac"));		//Returns 2
		System.out.println(findCountOfMyJewels("Af", "AaaddfFf"));	//Returns 3
		System.out.println(findCountOfMyJewels("AYOPD", "ayopd"));	//Returns 0	
	}
}
