/*Leetcode problem 11: Container with Most water 
Topic: Arrays, Two pointer
https://leetcode.com/problems/container-with-most-water/

*/
class 11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        
        while(i < j){
            
            int min = Math.min(height[i],height[j]);
            max = Math.max(max, min * (j - i));
            
            if(height[i] < height[j]){
                i += 1;
            }  
            else{
                j -= 1;
            }
        }
        return max;
    }
}
