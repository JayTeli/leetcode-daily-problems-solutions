https://leetcode.com/problems/unique-binary-search-trees/
// Algo 1 : DP : O(n^2) , O(n)
// 1. dp[0] = dp[1] = 1
// 2. dp[n] = for r=1 to n , summation of f(r,n)...where f(r,n) gives no of unique BST with root=r and n=no of nodes
// 3. f(r,n) = dp[r-1]*dp[n-r]
// 4. dp[n] = for r=1 to n , summation of dp[r-1]*dp[n-r]
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];// n+1 as we need dp[n]
        dp[0]=1;
        dp[1]=1;
        for(int i = 2 ; i <=n ; i++) { // <=
            for(int root = 1 ; root <= i ; root++) {
                dp[i] += dp[root-1]*dp[i-root];
            }
        }
        return dp[n];
    }
}
// Algo 2 : Catalan Number : O(n) , O(1)
// 1. C(0) = 1 , C(n+1) = C(n)*[2(2n+1)/(n+2)]
// 2. Question can be reframed : https://en.wikipedia.org/wiki/Catalan_number#Applications_in_combinatorics
class Solution {
    public int numTrees(int n) {
        long c = 1; // Mistake : int causes overflow
        for(int i = 0 ; i < n ; i++) {
            c = c*2*(2*i+1)/(i+2); // Mistake : c *= gives wrong ans coz number bcomes int.. so c = c*
        }
        return (int)c;
    }
}