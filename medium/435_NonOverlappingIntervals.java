/*
Pretty straightforward. Logic is that we sort by the first element in the intervals, then when we encounter an overlap, we increase the count,
and decide to remove the interval with the larger end date. 

In code, this translates to setting the "prevEnd" (the end time of the most recent non-deleted interval)to Math.min(current interval that we have encountered the conflict
with, current prevEnd).

*/


class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
          
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        int count = 0;
        int prevEnd = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
            if(prevEnd > intervals[i][0]) {
                count += 1;
                prevEnd = Math.min(prevEnd, intervals[i][1]);
            } else {
                prevEnd = intervals[i][1];
            }            
        }
        
        return count;
    }
}
