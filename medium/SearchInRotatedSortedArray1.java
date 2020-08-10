/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
You are given a target value to search. If found in the array return its index, otherwise return -1.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

*/

// Linear search can be done for O(n)
// By Binary searching, it is done in O(log n)w 

public class SearchInRotatedSortedArray1 {
    public int search(int[] nums, int target) {
        //Null check
        if(nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        //Find the pivot where it is rotated
        while(left < right){
            int mid = left + (right - left ) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        
        int start = left;
        left = 0;
        right = nums.length - 1;
        
        // Find where to start. From left to pivot? or pivot to right?
        if(target >= nums[start] && target <= nums[right]){
            left = start;        
        }
        else{
            right = start;
        }        
        
        //Actual binary search 
    while(left <= right){
        
        int mid = left + (right - left) / 2;
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] > target)
            right -= 1;
        else
            left += 1;
    }
        
       return -1; 
    }
}
