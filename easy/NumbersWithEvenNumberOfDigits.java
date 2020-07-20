/* Given an array nums of integers, return how many of them contain an even number of digits.
Example:
Input: nums = [12,345,2,6,7896]
Output: 2 

Solution:
0-9 (Odd - Skip)
10-99 (Even)
100-999 (Odd - Skip)
1000-9999 ( Even )
10000-99999 (Odd - Skip)
100000 (Even - Edge case)
*/

public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
         
            if((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || (nums[i] == 100000))
                count++;
        }
        return count;
    }
}
