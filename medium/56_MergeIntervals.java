/*
Example 

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]

Apporach: Sort the array and then merge the intervals if array[i][1] >= array[i+1][0], else go to the next interval

Time complexity = O(n log (n))
*/

class Solution {
    public int[][] merge(int[][] intervals) {
       
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        
        for(int[] interval : intervals) {
            if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
                merged.add(interval);
            } else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]) ;
    }
}
