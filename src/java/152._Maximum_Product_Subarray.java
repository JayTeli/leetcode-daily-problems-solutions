// Algo 1 : Dynamic programming : O(n) , O(1)
class Solution {
    public int maxProduct(int[] a) {
        int n = a.length;
        if(n == 0) return 0;
        int prevMaxSoFar = a[0] , minSoFar = a[0];
        int result = prevMaxSoFar , newMaxSoFar = prevMaxSoFar;
        for (int i = 1; i < n; i++) {
            newMaxSoFar = Math.max(a[i], Math.max(prevMaxSoFar * a[i], minSoFar * a[i]));
            minSoFar = Math.min(a[i] , Math.min(prevMaxSoFar * a[i], minSoFar * a[i]));
            prevMaxSoFar = newMaxSoFar;
            result = Math.max(result , newMaxSoFar);
        }
        return result;
    }
}