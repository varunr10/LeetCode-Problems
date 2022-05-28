package recursion;

import java.util.ArrayList;
import java.util.List;

public class ReverseAString {
	static List<Character> result = new ArrayList<>();
	public static void reverseString(char[] s) {

		displayChars(s, 0);
	}

	public static void displayChars(char[] s, int index) {

		if(index == s.length)
			return;
		displayChars(s, index+1);
		result.add(s[index]);
	}
  
	public void reverseStringUsingTwoPointers(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while(left <= right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            
            left += 1;
            right -= 1;
        }

    }
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}
}
