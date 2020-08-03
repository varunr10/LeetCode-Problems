//Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
/*
Example 1:
Input: "aba"
Output: True
Explanation: Already a palindrome. No need to delete

Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.

*/

public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int a_pointer = 0;
        int b_pointer = s.length() - 1;
        
        while(a_pointer <= b_pointer){
            if(s.charAt(a_pointer) != s.charAt(b_pointer))
              return  isPalindrome(s,a_pointer+1,b_pointer) 
                || isPalindrome(s,a_pointer, b_pointer-1);
            
            a_pointer += 1;
            b_pointer -= 1;
        }
        return true;
    }
    
    public boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
}
