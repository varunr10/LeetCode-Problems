/*
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1

Use the most efficient solution possible
*/
public class SearchInsertPosition {
    // Brute force Linear search O(n)
    public int searchInsert1(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] == target)
                return i;
            else if (nums[i] > target)
                return i;
            
        }
        return nums.length;
    }
    
    //Optimized Binary Search O(logn)
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
}
