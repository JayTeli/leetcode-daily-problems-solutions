https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/ 
// Algo 1 : Binary Search : O(n) , O(1)
class Solution {
    public int findMin(int[] a) {
        int n = a.length;
        if(n == 1) return a[0];
        if(n == 2) return Math.min(a[0] , a[1]);
        if(a[0] < a[n-1]) return a[0]; // no rotation or a.length times rotation
        
        int left = 0 , right = n-1;
        while(left < right) {
            int mid = left + (right-left)/2;
            if(a[mid] > a[mid+1]) return a[mid+1];  // pivot is biggest no
            if(a[mid-1] > a[mid]) return a[mid];    // pivot is smallest no
            if(a[0] < a[mid]) {                     // smallest is on right side
                left = mid+1;
            } else {                                // smallest is on left side
                right=mid-1;
            }   
        }
        return -1;
    }
}