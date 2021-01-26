/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]

Naive/brute force approach in Quadratic O(n^2), below approach is of linear complexity O(n) 
*/

public class RunningSumOf1dArray {
 
	public static int[] calculateRunningSumOf1DArray(int[] nums) {
		
		int length = nums.length;
	    int[] result = new int[length];
	    int runningSum = 0;
	    for(int i = 0; i < length; i++) {
	    	runningSum += nums[i];
	    	result[i] = runningSum;
	    }
	    
	    return result;
	}
	public static void main(String[] args) {
		
		System.out.println(calculateRunningSumOf1DArray(new int[] {1, 2, 3, 4, 5}));
	}
}
