class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[] {-1, -1};
        
        int[] result = new int[]{-1, -1}; 
        int left = 0;
        int right = nums.length - 1;
        
        
        while(left <= right) {
        	int mid = left + (right - left) / 2;
            if(nums[mid] > target) {
                right = mid - 1;    //Search the left part of the array
            } else if (nums[mid] < target) {
                left = mid + 1;     // Search the right part of the array
            } else {
                if(nums[right] != target) {
                    right -= 1;     // Search the previous element
                } else if(nums[left] != target) {
                    left += 1;      // Search the next element
                } else {
                    result[0] = left;
                    result[1] = right;
                    return result;
                }
            }
        }
        return result;
    }
}
