https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate
// Algo 1 : Iterate : O(n) , O(1)
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int dx = 0 , dy = 0 , smallestManhattan = Integer.MAX_VALUE , manhattan = 0 , ansIndex = -1 , index = 0;
        for(int[] p : points) {
            if(p[0] == x || p[1] == y) {
                dx = Math.abs(p[0] - x); dy = Math.abs(p[1] - y);
                manhattan = dx + dy;
                if(manhattan < smallestManhattan)  {
                    smallestManhattan =  manhattan;
                    ansIndex = index;
                }      
            }
            index++;
        }
        return ansIndex;
    }
}