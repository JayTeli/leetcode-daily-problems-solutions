https://leetcode.com/problems/search-in-rotated-sorted-array
// Algo 1 : Binary Search : O(logn),O(1)
class Solution {
    public int search(int[] a, int target) {
        int l = 0 , r = a.length-1;
        while(l <= r) {
            int mid = l + (r-l)/2;  // left-leaning
            int leftVal = a[l] , midVal = a[mid] , rightVal = a[r];
            if(midVal == target) return mid;
            else if(leftVal <= midVal) { // l to mid is sorted
                if(leftVal <= target && target < midVal) r = mid-1;
                else l = mid+1;
            } else {    // mid to r is sorted
                if(target > midVal && target <= rightVal) l = mid+1;
                else r = mid-1;
            }
        }
        return -1;
    }
}