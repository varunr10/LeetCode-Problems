/* Given a 32-bit signed integer, reverse digits of an integer.
Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output : 21

Example 4:

Input : 1
Output : 1

Time Complexity: O(log(x))

*/

class ReverseInteger {
   public int reverse(int x) {   
	        int num;
	        int newNum = 0;
	        while (x != 0){
	            num = x % 10;    
	            x = x / 10;
                // To eliminate invalid test cases like 1515125235235 
                if(newNum >Integer.MAX_VALUE/10 || newNum == Integer.MAX_VALUE/10&& num > 7)
                    return 0;
                if(newNum < Integer.MIN_VALUE/10 || newNum == Integer.MIN_VALUE/10&& num < -8)
                    return 0;
                
	            newNum = newNum * 10 + num;  
	            
	        }
	        return newNum;
	    }
}
