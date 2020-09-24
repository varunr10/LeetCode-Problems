package com.dailybyte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UncommonWords {

	public static String[] findUncommonWords(String str1, String str2) {
		
		if(str1.equals("") || str2.contentEquals("") || str1 == null || str2 == null) return new String[0];
		
		HashMap<String,Integer> hMap = new HashMap<String,Integer>();
		
		for(String word : (str1 + " " + str2).split(" ")){
			hMap.put(word,hMap.getOrDefault(word, 0)+1);
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(String word : hMap.keySet()) {
			if(hMap.get(word) == 1)
				list.add(word);
		}
		hMap=null;
        str1=null;
        str2=null;
		return list.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		findUncommonWords("The quick", "Brown fox"); 			//The quick brown fox
		findUncommonWords("CSK beat RCB", "KKR beat CSK"); 		//RCB KKR
		findUncommonWords("This is business", "This is Spartaaa"); //Business Spartaaa
	}
}
