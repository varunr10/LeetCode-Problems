class Solution {
    public int missingNumber(int[] nums) {
      int sum = 0;
      int max = nums.length;
        
        for(int num : nums){
            sum += num;
        }
        
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }
}
