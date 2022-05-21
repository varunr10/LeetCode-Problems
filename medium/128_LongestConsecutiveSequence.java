class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1)
            return nums.length;
        
        Set<Integer> hSet = new HashSet<Integer>();
        
        for(int num : nums) {
            hSet.add(num);
        }
        
        int longestStreak = 0;
        
        for(int num : hSet) {
            if(!hSet.contains(num - 1)){
                int currentNumber = num;
                int currentStreak = 1;
                
                while(hSet.contains(currentNumber + 1)) {
                    currentNumber += 1;
                    currentStreak += 1;
                }
                
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;   
    }
}
