package com.dailybyte;

public class LongestCommonPrefix {
	public static String findLongestCommonPrefix(String[] strs) {

		if(strs.length == 0 || strs == null) return "";

		StringBuilder sb = new StringBuilder("");

		int index = 0;
		for(char c : strs[0].toCharArray())
		{
			for(int i = 0; i < strs.length; i++){

				if(index >= strs[i].length() || c != strs[i].charAt(index))
					return sb.toString();
			}

			sb.append(c);
			index += 1;
		}

		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(findLongestCommonPrefix(new String[] {"NewZealand","NewOrleans",
				"NewCastle","NewMexico","NewJersey","NewDelhi"})); //Output is "New"
		
	}
}
