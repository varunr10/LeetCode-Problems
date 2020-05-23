/* Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
also in sorted non-decreasing order.
  Example 

  Input: [-4,-1,0,3,10]
  Output: [0,1,9,16,100]
Brute Force : Square all the elements and sort it using Collection.sort() or Arrays.sort()
Time Complexity : O(n Log(n)) - Log Linear, Bad

Optimal Solution: Create new Output array of same length as input array filled with Zeroes
                  Start from the last of Output array
                  Maintain left and right pointers and add the bigger number to output[i]
                  Increase/Decrease the Left/Right pointers accordingly
Time Complexity: O(n) - Linear, fair
                  
*/

class SquareOfSortedArray {
    public static int[] sortedSquares(int[] A) {
   
        int left = 0, right = A.length-1;
        int len = A.length;
        int[] output = new int[len];
       
       //Looping from the back
       int pos = A.length - 1;
        while(pos >= 0){
            
            if(Math.abs(A[left]) >= Math.abs(A[right]))
            {
               output[pos--] = A[left] * A[left];
                left += 1;
            }
            else{
                output[pos--] = A[right] * A[right];
                right -= 1;
            }

        }
        return output;
    }
    public static void main(String[] args) {
    	int[] input = {1,2};
    	input = sortedSquares(input);
    }
}
