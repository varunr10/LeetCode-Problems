/*
Given the array nums, for each element, find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

 

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]

Exmaple 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]

BruteForce: For every element, compare with other element and increment count. End of each outer loop, add count to Output array for i.
Time Complexity: O(n^2)

Optimal Solution: Coming soon hai 
Time Complexity: Coming soon hai
*/

class NumberOfElementsSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] output = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++)
            {   
                if(i != j && nums[i] > nums[j]){
                        count += 1;
                }
            }
            output[i] = count;
        }
        return output;   
    }
}
