https://leetcode.com/problems/remove-covered-intervals/
// Algo 1 : Greedy + Sorting : O(nlogn) , O(n)
// If we sort intervals by start time , we only have to compare end time to check overlap.
// Due to cases where start time is same , we need to sort based on end time too.
// if previousEnd < currentEnd , coveredInterval found.
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals , new IntervalsSorting());
        int count = 0 , currentEnd = 0 , previousEnd = 0;
        for(int[] interval : intervals) {
            currentEnd = interval[1];
            if(previousEnd < currentEnd) {
                ++count;
                previousEnd = currentEnd;
            }
        }
        return count;
    }
    
    // [a,b] , [x,y] : 
    // if a and x are differet , smaller of a and x to be first.
    // if a and x are same , larger of b and y to be first.
    class IntervalsSorting implements Comparator<int[]> {
        @Override
        public int compare(int[] i1 , int[] i2) {
            return i1[0] == i2[0] ? i2[1] - i1[1] : i1[0] - i2[0];
        }
    } 
}