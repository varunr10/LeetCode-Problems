package com.dailybyte;

import java.util.HashMap;

public class TwoSum {

	public static boolean findTwoSumPair(int[] input, int sum)
	{
		if(input.length == 0 || input == null) return false;
		HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
		for(int i = 0; i < input.length; i++) {
			if(hMap.containsKey(input[i])) {
				return true;
			}
			hMap.put(sum - input[i], input[i]);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(findTwoSumPair(new int[] {2, 7,11,15},9)); //True (Pair is 2 and 7)
		System.out.println(findTwoSumPair(new int[] {3,2,4},6)); //True (Pair is 2 and 4 )
		System.out.println(findTwoSumPair(new int[] {3,3},6)); //True (Pair is 3 and 3)
	}
}
