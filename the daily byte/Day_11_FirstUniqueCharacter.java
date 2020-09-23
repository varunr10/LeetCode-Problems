package com.dailybyte;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {
 
	//Using Hashmap Character and Count as <K,V>
	public static int findFirstUniqueCharacter1(String input) {
		
		LinkedHashMap<Character, Integer> hMap = new LinkedHashMap<Character, Integer>();
		
		for(Character c : input.toCharArray()) {
			if(!hMap.containsKey(c)) {
				hMap.put(c, 1);
			}
			else {
				hMap.replace(c,hMap.get(c)+1);
			}
		}
		Set set = hMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           Map.Entry<Character,Integer> me = (Map.Entry)iterator.next();
           if(me.getValue() == 1)
        	   return input.indexOf(me.getKey());
        }
		return 0;
	}
	//Using Hashmap Character, Index as <K,V>
	public static int findFirstUniqueCharacter(String input) {
		
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		int i = 0;
		for(Character c : input.toCharArray()) {
			if(!hMap.containsKey(c)) {
				hMap.put(c, i);
			}
			else {
				hMap.replace(c,-1);
			}
			i += 1;
		}
		Set set = hMap.entrySet();
        Iterator iterator = set.iterator();
        int min = Integer.MAX_VALUE;
        while(iterator.hasNext()) {
           Map.Entry<Character,Integer> me = (Map.Entry)iterator.next();
           if(me.getValue() != -1&& me.getValue() < min)
        	   min = me.getValue();
        }
		return min == Integer.MAX_VALUE ? -1 : min;
	}
	
	public static void main(String[] args) {
		System.out.println(findFirstUniqueCharacter("thedailybyte"));	// return 1
		System.out.println(findFirstUniqueCharacter("abcabd"));  		// return 2
		System.out.println(findFirstUniqueCharacter("developer"));		// return 0
		System.out.println(findFirstUniqueCharacter("leetcode"));		// return 0
		System.out.println(findFirstUniqueCharacter("loveleetcode"));   // return 2
	}
}
