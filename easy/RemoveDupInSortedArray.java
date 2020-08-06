/* Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input = [1,1,2,3,4,4,5],
Output = 5

*/
//Below solution doesn't modify the array but returns the length of array after removing duplicates. O(n) complexity 
//If we definitely need to modify and return the array, then we need to left shift elements after removing each duplicate. O(n^2) complexity.
public class RemoveDupInSortedArray {
    public int removeDuplicates(int[] nums) {
        
        int index = 1;
        
        for(int i=0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1])
            {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
