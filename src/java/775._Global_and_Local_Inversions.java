https://leetcode.com/problems/global-and-local-inversions/
// Algo 1 : Brute Force (TLE) : O(n^2) , O(1)
// Local is also Global. So check for non-local 
class Solution {
    public boolean isIdealPermutation(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i+2; j < a.length; j++)
                if (a[i] > a[j]) return false;
        return true;
    }
}
// Algo 2 : Math : Minimum : O(n) , O(1)
class Solution {
    public boolean isIdealPermutation(int[] a) {
        int minSoFar = a.length , n = a.length;
        for(int i = n-1 ; i >= 2 ; i--) {
            minSoFar = Math.min(minSoFar , a[i]);
            if(a[i-2] > minSoFar) return false;
        }
        return true;
    }
}
// Algo 3 : Linear Scan : O(n) , O(1)
class Solution {
    public boolean isIdealPermutation(int[] a) {
        for(int i = 0 ; i < a.length ; i++) {
            if(Math.abs(a[i] - i) > 1)
                return false;
        }
        return true;
    }
}