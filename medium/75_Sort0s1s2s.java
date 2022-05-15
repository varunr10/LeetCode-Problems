class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length;
        int low = 0;
        int mid = 0;
        int high = length - 1;
        
        while(mid <= high) {
            
            if(nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
           } 
            if (nums[mid] == 2) {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
                mid--;
            }
            mid++;                  
        }
    }
}
