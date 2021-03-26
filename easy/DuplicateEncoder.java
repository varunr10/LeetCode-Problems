// The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once 
// in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining
// if a character is a duplicate.
//
// Examples
//  "din"      =>  "((("
//  "recede"   =>  "()()()"

import java.util.HashMap;

public class DuplicateEncoder {
	public static String encode(String word){
    
	StringBuilder stringBuilder = new StringBuilder();
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    
    for(char c : word.toLowerCase().toCharArray()){
      if(!map.containsKey(c)) {
    	  map.put(c, 1);
      }
      else {
    	  map.put(c,(map.get(c)+1));
      }
    }
    
    for(char c : word.toLowerCase().toCharArray()) {
    	
    	char letter = (map.get(c) > 1) ? ')' : '(';
    	stringBuilder.append(letter);
    }
    
    return stringBuilder.toString();
  }
	
	public static void main(String[] args) {
		System.out.println(encode("recede"));
		System.out.println(encode("Success"));
	}
}
