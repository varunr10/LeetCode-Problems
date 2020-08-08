/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
*/

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String result = "";

		//Null check
		if(strs == null || strs.length == 0)
			return result;

		//index for the characters in strings
		int index = 0;

		for(char c: strs[0].toCharArray()){
			//Iterates  the strings in strings[]
			for(int i = 1; i < strs.length; i++){
				if(strs[i].length() <= index || c != strs[i].charAt(index)){           
					return result;
				}
			}
			result += c;
			index += 1;
		}
		return result;  
	}
	public String longestCommonPrefix1(String[] strs) {
		//First String in array
		String prefix = strs[0];

		//Null check
		if(strs == null || strs.length == 0) return "";
		//Loop through remaining
		for(int i = 1; i < strs.length;i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		return prefix;
	}
}
