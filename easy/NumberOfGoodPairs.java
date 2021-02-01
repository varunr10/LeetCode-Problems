/*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j. Return the number of good pairs.

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5)

Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
 */

public class NumberOfGoodPairs {
	public int numIdenticalPairs(int[] nums) {

		int count = 0;
		for(int i = 0; i < nums.length; i++){
			for(int  j = i+1; j < nums.length; j++){
				if(nums[i] == nums[j])
					count += 1;
			}
		}        
		return count; 
	}
}
