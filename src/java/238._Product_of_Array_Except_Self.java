https://leetcode.com/problems/product-of-array-except-self/
// Algo 1 : Using Left and Right Product arrays : O(n) , O(n)
// 1. Division operation is not allowed so prod for an index = leftProduct[i] * rightProduct[i]
// 2. leftProduct[i] = nums[i-1] * leftProduct[i - 1] , Slly rightProduct[i]
class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        leftProduct[0] = 1;
        for(int i = 1 ; i < n ; i++) 
            leftProduct[i] = leftProduct[i-1] * a[i-1];
        rightProduct[n-1] = 1;
        for(int i = n-2 ; i >= 0 ; i--)
            rightProduct[i] = rightProduct[i+1] * a[i+1];
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++) 
            ans[i] = leftProduct[i]*rightProduct[i];
        return ans;    
    }
}
// Algo 2 : Iteration and Space Optimization : O(n) , O(1)
// 1. In Algo2 , leftProduct[] of algo1 is directly stored in ans[]
// 2. instead of entire rightProduct[] , only the rightProduct[i] of algo 1 is stored in rightProduct variable
class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = test;
        int[] ans = new int[n];
        ans[0] = 1;
        for (int i = 1; i < n; i++)
            ans[i] = a[i-1] * ans[i-1];
        int rightProduct = 1;
        for (int i = n-1; i >= 0; i--) {
            ans[i] *= rightProduct;
            rightProduct *= a[i];
        }
        return ans;
    }
}