/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome

*/
class Solution {
    public static boolean isPalindrome(int x) {
		 int inputNumber = x;
          //Subtly waving bye to negative integers
	        if(x < 0)
	            return false;
	        int reversedNumber = 0;
	        while(x>0){  //0 exit
	            int digit = x % 10;   // 1
	            reversedNumber = reversedNumber * 10 + digit; // 21 + 100 * 1 = 121
	            x /= 10;            // 0
	        }
	       if(inputNumber != reversedNumber)
	           return false;
	        else
	            return true;
	    }
}
