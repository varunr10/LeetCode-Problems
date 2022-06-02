class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right) {
            if(target == nums[left] + nums[right]) {
                return new int[]{left+1, right+1};
            } else if( target < nums[left] + nums[right]) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left+1, right+1};
    }
}
