/* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*   You may assume that each input would have exactly one solution, and you may not use the same element twice.
*
*   Example:
*     Given nums = [2, 7, 11, 15], target = 9,
*     
*     Because nums[0] + nums[1] = 2 + 7 = 9,
*     return [0, 1].
*
*   Solution : 1. Brute Force approach - For every element, loop through the Array and check if there is target - element
*                  Time Complexity is O(n^2)
*               2. Two Pass Hash Table approach - For every element, check if complement exists in Hashtable. If not add the element into hashtable and move to the next elements.
*                 Time Complexity is O(n)
*                 Space Complexity is O(n) since we are using HashTable space for storing the elements from the Array
*/
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            
            if(hMap.containsKey(complement)){
                return new int[] {hMap.get(complement), i};
            }
            
            hMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
