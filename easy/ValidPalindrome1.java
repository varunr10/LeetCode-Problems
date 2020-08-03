//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
/*
Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
*/

public class ValidPalindrome1 {
    public boolean isPalindrome(String s) {
        
       String filtered_String= "";
        
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c))
                filtered_String += c;
        }
        
        filtered_String = filtered_String.toLowerCase();
        
        int a_Pointer = 0;
        int b_Pointer = filtered_String.length() - 1;
        
        while(a_Pointer <= b_Pointer){
            
            if(filtered_String.charAt(a_Pointer) != filtered_String.charAt(b_Pointer))
                return false;
            
            a_Pointer += 1;
            b_Pointer -= 1;
        }
        return true;
    }
}
