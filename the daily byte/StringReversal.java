package com.dailybyte;

import java.util.Stack;

public class StringReversal {
	
	public static String reverseString(String input) {
		
		if(input == "" || input == null) return "";
		
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
		
		return output.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Cat"));
		System.out.println(reverseString("The Daily Byte"));
		System.out.println(reverseString("civic"));
	}
}
