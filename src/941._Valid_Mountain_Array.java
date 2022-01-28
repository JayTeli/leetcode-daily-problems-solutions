// https://leetcode.com/problems/valid-mountain-array/
// Algo 1 : Iterate : O(n) , O(1)
class Solution {
    public boolean validMountainArray(int[] a) {
        int i = 0 , n = a.length;
        while(i+1 < n && a[i] < a[i+1]) i++;    // walking up the hill
        if(i == 0 || i == n-1) return false;    // peak should not be strt or end of hill
        while(i+1 < n && a[i] > a[i+1]) i++;    // walking down the hill
        return i==n-1;                          // i should be at end of hill
    }
}