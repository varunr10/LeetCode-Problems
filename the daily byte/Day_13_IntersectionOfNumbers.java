package com.dailybyte;

import java.util.HashSet;
import java.util.List;

public class IntersectionOfNumbers {

	public static int[] findIntersectionOfNumbers(int[] nums1, int[] nums2) {
	
		if(nums1.length == 0 || nums1 == null || nums2.length == 0 || nums2 == null) return new int[0];
		
		HashSet<Integer> hSet = new HashSet<Integer>();
		HashSet<Integer> insersectionSet = new HashSet<Integer>();
		
		for(Integer i : nums1) {
				hSet.add(i);
		}		
		for(Integer i : nums2) {
			if(hSet.contains(i)) {
				insersectionSet.add(i);
			}
		}
		
		int[] result = new int[insersectionSet.size()];
		int index = 0;
		for(int i : insersectionSet) {
			result[index++] = i;
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(findIntersectionOfNumbers(new int[] {2,4,4,2}, new int[] {2,4})); //Return [2,4]
		System.out.println(findIntersectionOfNumbers(new int[] {1,2,3,3}, new int[] {3,3})); //Return [3]
		System.out.println(findIntersectionOfNumbers(new int[] {1,2,3,4}, new int[] {5,6})); //Return []
	}
}
