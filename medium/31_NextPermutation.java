/*
I/P: [1,3,5,4,2]
O/P: [1,4,2,5,3]

Step 1) Traverse from behind and find index/breakpoint where array[i] < array[i+1], set breakpoint as index1
        [1,3,5,4,2], index1 - 3
           |
Step 2) Traverse from behind and find index/breakpoint where array[i] >= array[index1], set breakpoint as index2
        [1,3,5,4,2], index2 - 4
               |
Step 3) Swap the elements at index1 and index2
        [1,3,5,4,2]   =>  [1,4,5,3,2]

step 4) Reverse the subrarray from next of index1 to end of the list 
        [1,3,5,4,2]   =>  [1,4,2,3,5]
             |   |


Edgecase [5,4,3,2,1], break point in step1 does not exist because element keeps increasing from behind
So skip the first three steps, just reverse the array

        [5,4,3,2,1]   =>   [1,2,3,4,5]
        
TimeComplexity: 
Traverse from behind (twice)  O(n), reverse the subarray O(n)

O(n) + O(n) + O(n)

Space complexity:
O(n)
*/
class Solution {
    public void nextPermutation(int[] nums) {
        
        if(nums == null || nums.length <= 1)
            return;
        
        int index1 = nums.length - 2;
        
        //Find break point from behind where array[i] < array[i+1]
        while(index1 >= 0 && nums[index1] >= nums[index1 + 1]) {
            index1 -= 1;
        }
        int index2 = nums.length - 1;
        if(index1 >= 0) {
            while(index2 > index1 && nums[index2] <= nums[index1]) {
                index2 -= 1;
            }
            swap(nums, index1, index2);
        }
        
        reverseSubArray(nums, index1 + 1, nums.length - 1);
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void reverseSubArray(int[] nums, int start, int stop) {
        while(start < stop) {
            swap(nums, start++, stop--);
        }
    }
}
