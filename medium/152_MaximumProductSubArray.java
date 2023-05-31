class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int currentMin = 1;
        int currentMax = 1;
        
        for(int n : nums){
            int temp = n * currentMax;
            currentMax = Math.max(Math.max(n * currentMax, n * currentMin), n);
            currentMin = Math.min(Math.min(temp, n * currentMin), n);
            
            result = Math.max(currentMax, result);
        }
        return result;
    }
}
