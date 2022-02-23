https://leetcode.com/problems/search-a-2d-matrix/
// Algo 1 : Binary Search (Two Pass) : O(log(mn)) , O(1)
// First pass locate the row that may contain target.
// Second pass locate the column that may contain target.
// (Coded by me).
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length , cols = matrix[0].length;
        int r1 = 0 , r2 = rows-1 , rMid = 0;
        while(r1 <= r2) {   // Mistake : <= and not <
            rMid = r1 + (r2-r1)/2;
            if(target >= matrix[rMid][0] && target <= matrix[rMid][cols-1]) {         
                break;
            } else if(target < matrix[rMid][0]) {
                r2 = rMid-1;
            } else {
                r1 = rMid+1;
            }
        }
        int c1 = 0 , c2 = cols-1 , cMid = 0;
        while(c1 <= c2) {   // Mistake : <= and not <
            cMid = c1 + (c2-c1)/2;
            if(target == matrix[rMid][cMid]) {
                return true;
            } else if(target < matrix[rMid][cMid]){
                c2 = cMid-1;
            } else {
                c1 = cMid+1;
            }
        }
        return false;
    }
}
// Algo 2 : Binary Search (One Pass) : O(log(mn)) , O(1)
// midValue = matrix[midIndex / cols][midIndex % cols];
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length , cols = matrix[0].length;
        if(rows == 0 || cols == 0) return false;
        int l = 0 , r = rows*cols-1 , midIndex = 0 , midValue = 0;
        while(l <= r) { // Mistake : <= and not <
            midIndex = (l+r)/2;
            midValue = matrix[midIndex / cols][midIndex % cols];
            if(target == midValue) 
                return true;
            else {
                if(target < midValue) {
                    r = midIndex-1;
                } else {
                    l = midIndex+1;
                }
            }
        }
        return false;
    }
}